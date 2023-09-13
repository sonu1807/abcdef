package com.springcore.reff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext com= new ClassPathXmlApplicationContext("com/springcore/reff/reconfig.xml");
		
	A temp=(A) com.getBean("aref");
	System.out.println(temp.getX());
	System.out.println(temp.getOb().getY());
	
			
			
		
		
		
		
	}

}
