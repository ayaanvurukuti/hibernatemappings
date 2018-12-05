/*package com.controllers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojos.Course;
import com.pojos.Student;

public class ManyToManyExample {
	
	static SessionFactory sf;
	static {
		
		sf = new Configuration().configure().buildSessionFactory();
		
	}
	
	
	public static void main(String[] args) {
		
		save();
		
		//read();
	}


	private static void read() {
		Session session = sf.openSession();
		
		Student stu = (Student) session.get(Student.class, 1001);
		
		System.out.println(stu.getSname());
		List<Course> courseList = stu.getCourseList();
		
		for (Course course : courseList) {
			
			System.out.println(course.getCourseName()+" "+course.getCourseDuration());
		}
		
		
	}


	private static void save() {
		Student s1 = new Student();
		s1.setSid(150);
		s1.setSname("karthik");
		s1.setClg("Geetham Univercity");
		
		Student s2 = new Student();
		s2.setSid(160);
		s2.setSname("Venkat");
		s2.setClg("Dadi institute of engineering and technology");
		
		
		Student s3 = new Student();
		s3.setSid(140);
		s3.setSname("Ashok");
		s3.setClg("Viznan");
		
		
		Course c1 = new Course();
		c1.setCourseId(401);
		c1.setCourseName("Core Java");
		c1.setCourseDuration("3 months");
		
		Course c2 = new Course();
		c2.setCourseId(403);
		c2.setCourseName("Web Technologies");
		c2.setCourseDuration("2 months");

		Course c3 = new Course();
		c3.setCourseId(405);
		c3.setCourseName("Python");
		c3.setCourseDuration("3 month");

		s1.getCourseList().add(c1);
		s1.getCourseList().add(c2);
		s1.getCourseList().add(c3);
		
		s2.getCourseList().add(c1);
		s2.getCourseList().add(c2);
		
		
		s3.getCourseList().add(c1);
		
		
		c1.getListOfStudents().add(s1);
		c1.getListOfStudents().add(s2);
		c1.getListOfStudents().add(s3);
		
		c2.getListOfStudents().add(s1);
		c2.getListOfStudents().add(s2);
		
		c3.getListOfStudents().add(s1);
		
		
		
		Session session = sf.openSession();
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.beginTransaction().commit();
		session.close();
	}

}
*/