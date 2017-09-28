package com.bigacademy.p1.inheritance;

public class Person
{
	String fname;
	String lname;
	public Person(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	
	public void displayPerson()
	{
		System.out.println(fname+""+lname);
	}

}
