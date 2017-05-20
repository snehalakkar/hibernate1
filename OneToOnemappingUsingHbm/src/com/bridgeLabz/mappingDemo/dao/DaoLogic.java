package com.bridgeLabz.mappingDemo.dao;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeLabz.mappingDemo.dto.Address;
import com.bridgeLabz.mappingDemo.dto.Employee;

import configJar.SessionConfig;

public class DaoLogic {
	SessionFactory factory = SessionConfig.getFactory();
	Session session = factory.getCurrentSession();
	Iterator it;

	public void save(Employee emp) {
		Transaction tran = session.beginTransaction();
		session.persist(emp);
		tran.commit();
		System.out.println("\nsave successfully .....");
	}
}
