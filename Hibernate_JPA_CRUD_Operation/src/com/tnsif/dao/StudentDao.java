package com.tnsif.dao;

import com.tnsif.entities.Student;

public interface StudentDao 
{
	// CRUD Operation
	
	public abstract void addStudent(Student student1);
	
	public abstract Student getStudentById(int id);
	
	public abstract void updateStudent(Student student1);
	
	public abstract void removeStudent(Student student1);
	
	
	
	public abstract void commitTransaction();
	
	public abstract void beginTransaction();
	
}