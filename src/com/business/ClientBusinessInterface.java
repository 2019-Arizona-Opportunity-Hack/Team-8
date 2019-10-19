package com.business;

import com.model.Client;
import com.model.DTO;

public interface ClientBusinessInterface 
{
	public DTO<Client> read(int ID);
	public DTO<Client> create(Client client);
	public DTO<Client> update(Client client);
	public DTO<Client> delete(int ID);
	
	public void init();
	public void destroy();
}
