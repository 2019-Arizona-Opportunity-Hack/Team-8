package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.business.ClientBusinessInterface;
import com.business.ClientBusinessService;
import com.data.ClientDAO;
import com.data.ClientDataAccessInterface;

@Configuration
public class ApplicationConfig 
{
	@Bean(name="clientService", initMethod="init", destroyMethod="destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public ClientBusinessInterface getService()
	{
		return new ClientBusinessService();
	}
	
	@Bean(name="clientDAO", initMethod="init", destroyMethod="destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public ClientDataAccessInterface getDataService()
	{
		return new ClientDAO();
	}
}

