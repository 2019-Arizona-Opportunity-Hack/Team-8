
package com.controller;

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
	/*private String timeStamp;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String diagnosis;
	private long phoneNumber;
	private String parent1;
	private String parent2;
	private String email;
	private String address;
	private String reason;
	private String funding;
	private String availableDay;
	private String availableTime;
	private String notes; */
	@Autowired
	ClientBusinessInterface service;
	
	
	@RequestMapping(path="/do", method=RequestMethod.GET)
	public ModelAndView displayForm() {
		return new ModelAndView("ReferralForm", "client", new Client(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
	}
	
	@RequestMapping(path = "/doReg", method =RequestMethod.POST) 
	public ModelAndView showUser(@Valid @ModelAttribute("client")Client c, BindingResult result) {
		if(result.hasErrors()) 
			return new ModelAndView("ReferralForm","client",c);
		//Do Business Request
		//success
		return new ModelAndView("Results");
		//failure
		
	}
	
	
}