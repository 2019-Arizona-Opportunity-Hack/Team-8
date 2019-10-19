package com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.model.Calculation;

import com.business.CalcBusinessInterface;
import com.business.CalcBusinessService;
import com.controller.CalculationController;


//Stanley Backlund
//CST-221
//10-17-2019
//This is my own work
//Class is responsible for wiring up spring beans instead of manually threw xml
@Configuration  //Tells spring to look here for wiring
public class ApplicationConfig {
	@Bean(name="CalculationController")
	public Calculation getCalculationController() {
		return new Calculation();
	}
	@Bean(name="calcService", initMethod="init", destroyMethod="destroy")
	@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
	public CalcBusinessInterface getCalcBusinessService() {
		return new CalcBusinessService();
	}
	
}
