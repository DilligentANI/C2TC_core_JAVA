package com.std.service;

import com.std.entity.Student;

public interface StudentService 
{
	public abstract void addStudent(Student student);
	
	public abstract Student findStudentById(int id);
	
	public abstract void updateStudent(Student student);
	
	public abstract void removeStudent(Student student);
}