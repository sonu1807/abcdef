package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext com=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		 Emp emp1=com.getBean("emp1",Emp.class);
		 System.out.print(emp1);
		 
		 
	}

}
