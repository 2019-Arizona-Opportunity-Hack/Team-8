package com.business;

import java.util.List;

import com.model.Calculation;



public interface CalcBusinessInterface {
	public void test();
	public void init();
	public void destroy();
	public int doCalculation(Calculation c);
	
}
