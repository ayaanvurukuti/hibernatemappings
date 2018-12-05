package com.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pojos.Customer;

public class TestVersioning {
	
	public static void main(String[] args) {
		
		SessionFactory sf = DBUtil.getSessionFactory();
		
		Session session1 = sf.openSession();
		Customer c1 = (Customer) session1.get(Customer.class, 3);

		Session session2 = sf.openSession();
		Customer c2 = (Customer) session2.get(Customer.class, 3);

		c1.setCustAddress("Hyderabad");
		session1.beginTransaction().commit();

		c2.setShipTo("vizag");
		session2.beginTransaction().commit();
/*
		Customer c=new Customer();
		c.setCustName("Sachin Tendulkar");
		c.setCustAddress("Mumbai");
		c.setShipFrom("Mumbai");
		c.setShipTo("Banglore");
		
		session1.save(c);
		
		session1.beginTransaction().commit();
	*/
		
		session1.close();
	}

}
