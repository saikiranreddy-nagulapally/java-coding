package com.bigacademy.p1.inheritance;

public class PersonStudentTrainer 
{
	public static void main(String[] args)
	{

		Student s1= new Student("sai","kiran",1,"texas");
		s1.displayPerson();
		s1.displayStudent();
		Trainer t1= new Trainer("uday","kiran","goodworker",200,"permanent");
		t1.displayPerson();
		t1.displayTrainer();
	}

}
