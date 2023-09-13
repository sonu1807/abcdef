package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext com=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p=(Person) com.getBean("person");
		System.out.println(p);
		Addition add=(Addition) com.getBean("add");
		add.dosum();
		
		
		
		
		
		
	}   

}
