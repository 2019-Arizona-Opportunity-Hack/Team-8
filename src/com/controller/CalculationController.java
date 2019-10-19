package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.business.CalcBusinessService;

import com.business.CalcBusinessInterface;
import com.model.Calculation;

@Controller
@RequestMapping("/calculator")
public class CalculationController {
	
	//referenced in app config, config adds "set" behind OrdersService
	//Happens in the backend of spring 
	//with autowire tag no app config is needed
	@Autowired
	CalcBusinessInterface service;
	
	
	@RequestMapping(path="/do", method=RequestMethod.GET)
	public ModelAndView displayForm() {
		return new ModelAndView("Calculator", "calculation", new Calculation(0, 0, 0));
	}
	
	@RequestMapping(path = "/doCalc", method =RequestMethod.POST) 
	public ModelAndView showUser(@Valid @ModelAttribute("calculation")Calculation calc, BindingResult result) {
		if(result.hasErrors()) 
			return new ModelAndView("Calculator","calculation",calc);
		//Do calculation
		int answer=service.doCalculation(calc);
		if(answer!=-1) {
			return new ModelAndView("Results", "msg", Integer.toString(answer));
		}else {
			return new ModelAndView("Error","msg", Integer.toString(answer));
		}
		
	}
	
}
