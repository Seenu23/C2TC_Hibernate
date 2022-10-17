package com.tnsif.client;


import com.tnsif.entities.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
		//student.setStudentid(6);
	//student.setName("Avantika");
	//service.addStudent(student);
		
		
	      //Retrieve Operation
		//service.findStudentById(6);
		//System.out.println("ID is: "+student.getStudentid());
	    //System.out.println("Name is: "+student.getName());
		
		
		
		/*Update Operation
		student  =service.findStudentById(6);
		student.setName("Avantika A ");
		service.updateStudent(student);
		
		
	service.findStudentById(6);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
		student=service.findStudentById(6);
		service.removeStudent(student);
		System.out.println("Row removed");*/
		
		
	}

}