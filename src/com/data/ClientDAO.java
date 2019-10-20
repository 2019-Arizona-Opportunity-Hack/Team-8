package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Client;
import com.model.DTO;
import com.model.Database;

public class ClientDAO implements ClientDataAccessInterface 
{	
	Database db = null;
	
	public ClientDAO()
	{
		db = new Database();
	}
	
	@Override
	public DTO<Client> read(int ID) 
	{
		Connection conn = null;
		DTO<Client> dto = null;
		Client client = null;
		
		try 
		{	
			conn = db.open();
			
			String sql = "SELECT * FROM client WHERE id = " + ID;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next())
			{
				client = new Client(rs.getInt("id"), rs.getString("time"), rs.getString("first"), rs.getString("last"), rs.getString("birthday"), 
						rs.getString("diagnosis"), rs.getString("phoneNumber"), rs.getString("parentA"), rs.getString("parentB"), rs.getString("email"), 
						rs.getString("address"), rs.getString("reason"), rs.getString("funding"), rs.getString("availableDay"), rs.getString("availableTime"), 
						rs.getString("notes"));
			}
			
			dto = new DTO<Client>(rs.getRow(), ((client == null) ? "FAILURE" : "OK"), client);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(conn);
		}
		return dto;
	}

	@Override
	public DTO<Client> create(Client client) 
	{
		Connection conn = null;
		DTO<Client> dto = null;
		
		try
		{
			conn = db.open();
			
			PreparedStatement sql = conn.prepareStatement(
					"INSERT INTO `client` (`id`, `time`, `first`, `last`, `birthday`, "
					+ "`phoneNumber`, `diagnosis`, `parentA`, `parentB`, `email`, "
					+ "`address`, `reason`, `funding`, `availableDay`, `availableTime`, `notes`) VALUES "
					+ "(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
					);
			
			sql.setString(1, client.getTimeStamp());
			sql.setString(2, client.getFirstName());
			sql.setString(3, client.getLastName());
			sql.setString(4, client.getBirthDate());
			sql.setString(5, client.getPhoneNumber());
			sql.setString(6, client.getDiagnosis());
			sql.setString(7, client.getParent1());
			sql.setString(8, client.getParent2());
			sql.setString(9, client.getEmail());
			sql.setString(10, client.getAddress());
			sql.setString(11, client.getReason());
			sql.setString(12, client.getFunding());
			sql.setString(13, client.getAvailableDay());
			sql.setString(14, client.getAvailableTime());
			sql.setString(15, client.getNotes());
			
			int rowCount = sql.executeUpdate();
			
			dto = new DTO<Client>(rowCount, ((rowCount != 0) ? "OK" : "FAILURE"), client);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(conn);
		}
		return dto;
	}

	@Override
	public DTO<Client> update(Client client) 
	{	
		Connection conn = null;
		DTO<Client> dto = null;
		
		try
		{
			conn = db.open();
			
			PreparedStatement sql = conn.prepareStatement(
					"UPDATE client SET `time` = '?', `first` = '?', `last` = '?', `birthday` = '?',"
					+ "`phoneNumber` = '?', `diagnosis` = '?', `parentA` = '?', `parentB` = '?', `email` = '?',"
					+ "`address` = '?', `reason` = '?', `funding` = '?', `availableDay` = '?', `availableTime` = '?',"
					+ "`notes` = '?' WHERE `client`.`id` = '?'"
					);
			
			sql.setString(1, client.getTimeStamp());
			sql.setString(2, client.getFirstName());
			sql.setString(3, client.getLastName());
			sql.setString(4, client.getBirthDate());
			sql.setString(5, client.getPhoneNumber());
			sql.setString(6, client.getDiagnosis());
			sql.setString(7, client.getParent1());
			sql.setString(8, client.getParent2());
			sql.setString(9, client.getEmail());
			sql.setString(10, client.getAddress());
			sql.setString(11, client.getReason());
			sql.setString(12, client.getFunding());
			sql.setString(13, client.getAvailableDay());
			sql.setString(14, client.getAvailableTime());
			sql.setString(15, client.getNotes());
			sql.setInt(16, client.getID());
			
			ResultSet rs = sql.executeQuery();
			
			int rowCount = 0;
			while (rs.next()) { rowCount++; }
			
			dto = new DTO<Client>(rowCount, ((rowCount != 0) ? "OK" : "FAILURE"), client);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(conn);
		}
		return dto;
	}

	@Override
	public DTO<Client> delete(int ID) 
	{
		Connection conn = null;
		DTO<Client> dto = null;
		
		try
		{
			conn = db.open();
			
			PreparedStatement sql = conn.prepareStatement("DELETE FROM `client`	WHERE `client`.`id` = '?'");
			
			sql.setInt(1, ID);
			
			ResultSet rs = sql.executeQuery();
			
			int rowCount = 0;
			while (rs.next()) { rowCount++; }
			
			dto = new DTO<Client>(rowCount, ((rowCount != 0) ? "OK" : "FAILURE"), new Client());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(conn);
		}
		return null;
	}

	@Override
	public DTO<List> search(String query)
	{
		Connection conn = null;
		List<Client> results = new ArrayList<>();
		DTO<List> dto = null;
		
		try
		{
			conn = db.open();
			
			String sql = "SELECT * FROM `client` WHERE `time` = " + query + " OR `first` = " + query
					+ " OR `last` = " + query + " OR `birthday` = " + query + " OR `phoneNumber` = " + query 
					+ " OR `diagnosis` = " + query + " OR `parentA` = " + query + " OR `parentB` = " + query
					+ " OR `email` = " + query + " OR `address` = " + query + " OR `reason` = " + query 
					+ " OR `funding` = " + query + " OR `availableDay` = " + query + " OR `availableTime` = " + query;
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			int rowCount = 0;
			while (rs.next())
			{
				rowCount++;
				Client client = new Client(rs.getInt("id"), rs.getString("time"), rs.getString("first"), rs.getString("last"), rs.getString("birthday"), 
						rs.getString("diagnosis"), rs.getString("phoneNumber"), rs.getString("parentA"), rs.getString("parentB"), rs.getString("email"), 
						rs.getString("address"), rs.getString("reason"), rs.getString("funding"), rs.getString("availableDay"), rs.getString("availableTime"), 
						rs.getString("notes"));
				
				results.add(client);
			}
			
			dto = new DTO<List>(rowCount, ((rowCount != 0) ? "OK" : "FAILURE"), results);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(conn);
		}
		
		return dto;
	}
	
	@Override
	public void init() {}

	@Override
	public void destroy() {}

}
