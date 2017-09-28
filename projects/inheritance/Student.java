package com.bigacademy.p1.inheritance;

public class Student extends Person
{
	int stdno;
	String stdadd;
	public Student(String fname, String lname,int stdno,String stdadd)
	{    
		super(fname,lname);
		this.stdno=stdno;
		this.stdadd=stdadd;
	}
	
	public void displayStudent()
	{
		
		System.out.println("stdno:" +stdno);
		System.out.println("stdadd:" +stdadd);
	}


}
