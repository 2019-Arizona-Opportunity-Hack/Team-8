package com.data;

import com.model.Client;
import com.model.DTO;
import com.model.Database;

public class ClientDAO implements ClientDataAcessInterface 
{
	private Database db;
	
	@Override
	public DTO<Client> read(int ID) 
	{
		return null;
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
