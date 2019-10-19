package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Calculation {
	
	@Min(value=1, message="must be equal or greater than 18")
	private int op1;
	
	@Min(value=1, message="must be greater than 0")  
	private int op2;
	
	@Min(value=0, message="must be greater than or equal to 1")  
    @Max(value=3, message="must be less than 4")  
	private int funct;
	public Calculation(int op1, int op2, int funct) {
		
		this.op1 = op1;
		this.op2 = op2;
		this.funct = funct;
	}
	public Calculation() {
		// TODO Auto-generated constructor stub
	}
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public int getFunct() {
		return funct;
	}
	public void setFunct(int funct) {
		this.funct = funct;
	}
	
}
