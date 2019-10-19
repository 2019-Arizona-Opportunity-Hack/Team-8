package com.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import com.model.Calculation;

public class CalcBusinessService implements CalcBusinessInterface{
	public void test() {
		System.out.println("hello from CBS");
		
	}
	public void init() {
		System.out.println("cBS initializeedd. . . . ");
	}
	public void destroy() {
		System.out.println("cBS Destroyed. . . ");
	}
	@Override
	public int doCalculation(Calculation c) {
		int answer;
		
		if(c.getFunct()==0) {
			System.out.println("Adding");
			answer=c.getOp1()+c.getOp2();
			return answer;
		}else if(c.getFunct()==1) {
			System.out.println("Subtracted");
			answer=c.getOp1()-c.getOp2();
			return answer;
		}else if(c.getFunct()==2) {
			System.out.println("Multiply");
			answer=c.getOp1()*c.getOp2();
			return answer;
		}else if(c.getFunct()==3) {
			System.out.println("Divided");
			answer=c.getOp1()/c.getOp2();
			return answer;
		}else {
			//error
			System.out.println("unable to add. . .function was not accepted (0-3 accepted)");
			return -1;
		}
		
		
	}
	
}
