
package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		
	@RequestMapping(path="/referral", method=RequestMethod.GET)
	public ModelAndView displayForm() 
	{
		return new ModelAndView("ReferralForm", "client", new Client());
	}
	
	@RequestMapping(path = "/reg", method =RequestMethod.POST) 
	public ModelAndView tryReg(@Valid @ModelAttribute("client")Client client, BindingResult result) 
	{
		if(result.hasErrors()) 
		{
			return new ModelAndView("ReferralForm","client",client);
		}
		if(clientService.register(client)!=null) 
		{
			return new ModelAndView("Results","client", client);
		}
		
		String msg = "Error Occurred";
		return new ModelAndView("Error","msg",msg);
	}
	
	@RequestMapping(path = "/appointments", method = RequestMethod.GET)
	public ModelAndView showAppointments()
	{
		return new ModelAndView("ShowAllClients", "client", new Client());
	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView showAllClients()
	{
		List<Client> clients = clientService.findAll();
		
		ModelAndView mv = new ModelAndView("ShowAllClients", "clients", clients);
		Client query = new Client();
		
		mv.addObject("query", query);
		
		return mv;
	}
	
	@RequestMapping(path = "/genSearch", method = RequestMethod.POST)
	public ModelAndView generalSearch(@ModelAttribute("query")Client query)
	{
		List<Client> results = new ArrayList<>();
		results = clientService.search(query.getNotes());
		
		ModelAndView mv = new ModelAndView("ShowAllClients", "clients", results);
		query = new Client();
		
		mv.addObject("query", query);
		
		return mv;
	}
	
	@Autowired
	public void setService(ClientBusinessInterface clientService)
	{
		this.clientService = clientService;
	}
}