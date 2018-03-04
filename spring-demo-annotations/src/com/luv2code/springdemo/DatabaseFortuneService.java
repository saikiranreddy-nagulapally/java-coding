package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService 
{
	
	@Override
	public String getFortune() 
	{
		return "saikiranreddy";
	
		}

}
