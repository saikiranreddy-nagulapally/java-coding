package com.bigacademy.p1.inheritance;

public class Trainer extends Person
{
	String subject;
	int salary;
	String type;
    Trainer(String fname, String lname,String subject,int  salary,String type)
	{
		super(fname,lname);
		this.subject=subject;
		this.salary=salary;
		this.type=type;
	}
	public void displayTrainer()
	{
		
		System.out.println("subject:"+subject);
		System.out.println("salary:"+salary);
		System.out.println("type:"+type);
	}


	

}
