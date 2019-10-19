package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.Client;
import com.model.DTO;

public class ClientDAO implements ClientDataAccessInterface 
{	
	@Override
	public DTO<Client> read(int ID) 
	{
		DTO<Client> dto = null;
		Client client = null;
		
		try 
		{	
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nmtsadb", "root", "root");
			
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
			
			conn = null;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public DTO<Client> create(Client client) 
	{
		return null;
	}

	@Override
	public DTO<Client> update(Client client) 
	{	
		return null;
	}

	@Override
	public DTO<Client> delete(int ID) 
	{
		return null;
	}

	@Override
	public void init() {}

	@Override
	public void destroy() {}

}
