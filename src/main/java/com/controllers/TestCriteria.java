package com.controllers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojos.Student;

public class TestCriteria {
	
	public static void main(String[] args) {
		SessionFactory sf = DBUtil.getSessionFactory();
		Session session = sf.openSession();
		
		
		Criteria criteria = session.createCriteria(Student.class);
	criteria.add(Restrictions.eq("sname", "Sridher"));
	//	criteria.add(Restrictions.between("sid", 1001, 1003));//("sid", 1001));
		//criteria.add(Restrictions.gt("sid", 1001));
	//criteria.add(Restrictions.lt("sid", 1003));
		
		/*
		ProjectionList proList = Projections.projectionList();
	    proList.add(Projections.property("sname"));
	    proList.add(Projections.property("clg"));
	    proList.add(Projections.property("sid"));
	    
		criteria.setProjection(proList); // for morethan one projections, use this line of code
		//criteria.addOrder(Order.desc("sid"));
*/		
		//criteria.setProjection(Projections.property("clg")); // this code only for one projection
		
	/*	List<Object[]> list = criteria.list();

		for (Object[] value : list) {

			
			System.out.println(value[0]+" "+value[1]+" "+value[2]);
		}
		*/
	List<Student> list = criteria.list();

	for (Student student : list) {
		System.out.println(student);
	}
	
		
	/*	//  below code for only one projection 
		  List<String> list = criteria.list();
		
		for (String value : list) {
			System.out.println(value);
		}
		*/
	/*	the below for all columns
	 * 
	 * List<Student> list = criteria.list();
		
		
		for (Student student : list) {
			System.out.println(student.getSid()+" "+ student.getSname()+" "+student.getClg());
		}*/
	}

}
