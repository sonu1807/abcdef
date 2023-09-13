package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext com=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		
		
		Samosa s1=(Samosa) com.getBean("s1");
		System.out.println(s1);
		
		
		
		System.out.println("+++++++++++++++++++");
		Pepsi p1=(Pepsi) com.getBean("p1");
		System.out.println(p1);
		
		
		
	}

}
