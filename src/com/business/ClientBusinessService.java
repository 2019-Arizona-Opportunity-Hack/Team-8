package com.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.ClientDataAccessInterface;
import com.model.Client;
import com.model.DTO;

public class ClientBusinessService implements ClientBusinessInterface 
{
	ClientDataAccessInterface clientDAO;
	
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
