package com.business;

import com.model.Client;
import com.model.DTO;

public interface ClientBusinessInterface 
{
	public DTO<Client> find(int ID);
	public Client register(Client client);
	public DTO<Client> edit(Client client);
	public DTO<Client> remove(int ID);
	
	public void init();
	public void destroy();
}
