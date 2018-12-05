package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojos.College;
import com.pojos.Student;
import com.pojos.University;

public class OneToManyController {
	
	static SessionFactory sf;
	static {
		
		sf = new Configuration().configure().buildSessionFactory();
		
	}
	
	public static void main(String[] args) {
		
		//save();
		
		read();
	}

	private static void read() {
		
		Session session = sf.openSession();
		
	 University uv =	(University) session.load(University.class, 501);
	 
	 
	 session.clear();
	 System.out.println(uv.getUniName());
	 
	 List<College> clgList = uv.getClgList();
	 
	 College college = clgList.get(0);
	 
	 System.out.println(college.getClgName());
	 
	/* for (College college : clgList) {
		System.out.println(college.getClgName());
	}*/
		
		/*Query query = session.createQuery("select sname ,sid from Student");
		
		List<Object[]> list = query.list();
		
		
		for (Object[] objects : list) {
			
			System.out.println("id is: "+objects[0]+ " name is: "+objects[1]);
			
		}*/ 
		
		
		
		
		/*College clg = (College) session.get(College.class, 10001);
		
		System.out.println(clg.getClgName()+" "+clg.getLocation());
		
		System.out.println(clg.getUni().getUniName()+" "+clg.getUni().getLocation());
		
		University univ= (University)session.get(University.class, 502);
		
		System.out.println(univ.getUniName()+" "+univ.getLocation());
		
		List<College> clgList = univ.getClgList();
		
		for (College college : clgList) {
			
			System.out.println(college.getClgName()+" "+college.getLocation());
		}
		
		*/
		
	}

	private static void save() {

		University uni = new University();
		uni.setId(511);
		uni.setUniName("OU");
		uni.setLocation("SECUNDERABAD");
		
		
		College c1 =new College();
		c1.setId(1023);
		c1.setClgName("CBIT-1");
		c1.setLocation("GANDIPET-1");
		c1.setUni(uni);
		
		College c2 =new College();
		c2.setId(1034);
		c2.setClgName("VASAVI-1");
		c2.setLocation("LANGERHOUSE-1");
		c2.setUni(uni);
		
		College c3 =new College();
		c3.setId(1045);
		c3.setClgName("MVSR-1");
		c3.setLocation("NADERGUL-1");
		c3.setUni(uni);
		
		
		List<College> list = new ArrayList<College>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		uni.setClgList(list);
		
		
		Session session = sf.openSession();
		
		for (College college : list) {
			
			session.save(college);
		}
		
		
		session.beginTransaction().commit();
		
		session.close();
	}

}
