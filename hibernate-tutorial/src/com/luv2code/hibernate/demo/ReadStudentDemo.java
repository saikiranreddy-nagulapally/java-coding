package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("uday", "reddy", "uday@luv2code.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			
			// commit transaction
			session.getTransaction().commit();
			//my new code
			
			//find out the student id
			System.out.println("saved student.generated id:" +tempStudent.getId());
			//now get a new session and current session
			session=factory.getCurrentSession();
			//start a transaction
			session.beginTransaction();
			System.out.println("\n getting student with id :"+tempStudent.getId());
			Student mystudent= session.get(Student.class, tempStudent.getId());
			System.out.println("get complete"+mystudent);
			//commit
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





