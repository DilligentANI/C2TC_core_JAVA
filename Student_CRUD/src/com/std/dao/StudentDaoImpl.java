package com.std.dao;

import javax.persistence.EntityManager;

import com.std.entity.Student;

public class StudentDaoImpl implements StudentDao 
{
	private EntityManager entityManager;

	public StudentDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public void addStudent(Student student)
	{
		entityManager.persist(student);//no sql queries
	}
	
	public Student getStudentById1(int id)
	{
		Student student= entityManager.find(Student.class, id);
		return student;
	}
	public void updateStudent(Student student)
	{
		entityManager.merge(student);
	}
	public void removeStudent(Student student)
	{
		entityManager.remove(student);
	}
	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	
	
	
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
			Student student = entityManager.find(Student.class, id);
			return student;
			
	}


}