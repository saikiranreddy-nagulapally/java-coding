package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	public TennisCoach()
	{
		System.out.println("TennisCoach: inside default constructor");
	}
	
	//init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("tennis coach: inside doMyStartupStuff()");
	}
	//destroy method
	@PreDestroy
	public void cleanUpStuff()
	{
		System.out.println("tennis Coahc :inside cleanUpStuff()");
	}
	/*
	@Autowired
	public  void  setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach: inside a setFortuneService");
		fortuneService=theFortuneService;
	}
	*/
	
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	*/
	
	public String getDailyWorkout() 
	{
		
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
