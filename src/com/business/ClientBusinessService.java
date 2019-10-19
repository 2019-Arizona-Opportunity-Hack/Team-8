package com.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.ClientDataAccessInterface;
import com.model.Client;
import com.model.DTO;

public class ClientBusinessService implements ClientBusinessInterface 
{
	ClientDataAccessInterface clientDAO;
	
	@Override
	public DTO<Client> read(int ID) 
	{
		DTO<Client> dto = clientDAO.read(ID);
		return dto;
	}

	@Override
	public DTO<Client> create(Client client) 
	{
		DTO<Client> dto = clientDAO.create(client);
		return dto;
	}

	@Override
	public DTO<Client> update(Client client) 
	{
		DTO<Client> dto = clientDAO.update(client);
		return dto;
	}

	@Override
	public DTO<Client> delete(int ID) 
	{
		DTO<Client> dto = clientDAO.delete(ID);
		return dto;
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
