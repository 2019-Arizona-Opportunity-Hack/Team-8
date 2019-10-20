package com.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.ClientDataAccessInterface;
import com.model.Client;
import com.model.DTO;

public class ClientBusinessService implements ClientBusinessInterface 
{
	ClientDataAccessInterface clientDAO;
	
	@Override
	public DTO<Client> find(int ID) 
	{
		clientDAO.read(ID);
		return null;
	}

	@Override
	public DTO<Client> register(Client client) 
	{
		clientDAO.create(client);
		return null;
	}

	@Override
	public DTO<Client> edit(Client client) 
	{
		clientDAO.update(client);
		return null;
	}

	@Override
	public DTO<Client> remove(int ID) 
	{
		clientDAO.delete(ID);
		return null;
	}
	
	@Override
	public void init() {}

	@Override
	public void destroy() {}
	
	@Autowired
	public void setDataService(ClientDataAccessInterface clientDAO)
	{
		this.clientDAO = clientDAO;
	}

}
