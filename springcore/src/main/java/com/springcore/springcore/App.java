package com.springcore.springcore;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
  ApplicationContext com = new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");
                          student student = com.getBean("stu", student.class);
                          System.out.println(student);
        
    }
}
