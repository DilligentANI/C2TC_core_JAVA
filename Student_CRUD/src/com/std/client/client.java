package com.std.client;

import com.std.entity.Student;
import com.std.service.StudentService;
import com.std.service.StudentServiceImpl;


public class client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		/*
		student.setStudentid(1);
		student.setName("Aniket ");
		service.addStudent(student);
		
		student.setStudentid(2);
		student.setName("Avantika ");
		service.addStudent(student);
		
		student.setStudentid(3);
		student.setName("Roni ");
		service.addStudent(student);*/
		
		student.setStudentid(4);
		student.setName("Ani ");
		service.addStudent(student);
		
		student.setStudentid(5);
		student.setName("Shubham");
		service.addStudent(student);
		
		student.setStudentid(6);
		student.setName("Ankit");
		service.addStudent(student);
		
		
		
	// Retrieve Operation
	//	service.findStudentById(104);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
		/*student  =service.findStudentById(1);
		student.setName("Aniket ");
		service.updateStudent(student);*/
		
		
		service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
		student=service.findStudentById(1);
		service.removeStudent(student);
		System.out.println("Row removed");
	
		}
}
		
	