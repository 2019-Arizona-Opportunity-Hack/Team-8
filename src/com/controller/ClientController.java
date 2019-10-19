package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.business.ClientBusinessInterface;
import com.model.Client;
import com.model.DTO;

@Controller
@RequestMapping("/client")
public class ClientController 
{
	ClientBusinessInterface clientService;
	
	@RequestMapping(path="/test", method=RequestMethod.GET)
	public ModelAndView test()
	{
		DTO<Client> dto = clientService.read(1);
		
		if(dto == null)
		{
			System.out.println("Failure");
		}
		else
		{
			System.out.println(dto.getErrorCode() + ", " + dto.getErrorMsg() + ", " + dto.getData());
		}
		
		return new ModelAndView("Error");
	}
	
	@Autowired
	public void setService(ClientBusinessInterface clientService)
	{
		this.clientService = clientService;
	}
	
	
}
