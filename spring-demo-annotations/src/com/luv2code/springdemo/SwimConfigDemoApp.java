package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimConfigDemoApp
{
	public static void main(String[]args)
	{
		//read spring from config file
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//call our new swim coach methods
		System.out.println("email:"+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());
		//close the context
		context.close();
	}
		

}
