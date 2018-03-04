package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) 
	{
		//load spring file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
	    //retrieve bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		//check if they are same or not
		boolean result=(theCoach==alphaCoach);
		//print out the results
		System.out.println(result);
		System.out.println("memory location for the theCoach:"+theCoach);
		System.out.println("memory location for the alphaCoach:"+alphaCoach);
		context.close();
		
		}
	

}
