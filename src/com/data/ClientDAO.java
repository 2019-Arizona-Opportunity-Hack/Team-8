package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Client;
import com.model.DTO;
import com.model.Database;

public class ClientDAO implements ClientDataAcessInterface 
{
	private Database db;
	
	@Override
	public DTO<Client> read(int ID) 
	{
		Connection conn = null;
		DTO<Client> dto = null;
		Client client = null;
		
		try 
		{	
			conn = db.open();
			
			String sql = "SELECT * FROM nmtsaDB.CLIENT WHERE id = " + ID;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			client = new Client(rs.getString(""), rs.getString(""), rs.getString(""), rs.getString(""), 
					rs.getString(""), rs.getInt(""), rs.getString(""), rs.getString(""), rs.getString(""), 
					rs.getString(""), rs.getString(""), rs.getString(""), rs.getString(""), rs.getString(""), 
					rs.getString(""));
			
			dto = new DTO<Client>(rs.getFetchSize(), "", client);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if (conn != null)
			{
				db.close(conn);
			}
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
