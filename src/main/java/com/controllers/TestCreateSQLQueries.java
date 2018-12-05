package com.controllers;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.pojos.Student;

public class TestCreateSQLQueries {
	
	public static void main(String[] args) {
		
		Session session = DBUtil.getSessionFactory().openSession();
		
		SQLQuery query = session.createSQLQuery("select * from student");
		//query.addEntity(Student.class);
		List<Object[]> list = query.list();
		
		for (Object[] objects : list) {
			
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}
		
	/*	for (Student student : list) {
			System.out.println(student.getSid()+" "+student.getSname()+" "+student.getClg());
		}*/
	}

}
