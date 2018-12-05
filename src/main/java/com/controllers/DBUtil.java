package com.controllers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	public static SessionFactory getSessionFactory() {
		
		return new Configuration().configure().buildSessionFactory();
	}
}
