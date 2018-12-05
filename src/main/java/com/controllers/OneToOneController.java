package com.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojos.Passport;
import com.pojos.Student;

public class OneToOneController {

	
	public static void main(String[] args) {
		
/*		
		Student st=new Student();
		//st.setSid(101);
		st.setClg("GRIET");
		st.setSname("Srinivas");
		
		Passport  p = new Passport();
		p.setpNumber("K1854534");
		p.setExpireDate("2022");
		
		st.setPp(p);
		p.setStu(st);
*/		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		//session.save(st);
		Student stu = (Student) session.get(Student.class, 1);
		
		System.out.println(stu.getSname());
		
		//session.beginTransaction().commit();
		
	}
}
