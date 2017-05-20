package com.bridgeLabz.onetoone.dao;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgeLabz.onetoone.dto.Country;
import com.bridgeLabz.onetoone.dto.PrimeMinister;

import configJar.SessionConfig;

public class Daoclass {
	SessionFactory factory = SessionConfig.getFactory();
	Session session = factory.getCurrentSession();
	Iterator it;
	
	public void save(PrimeMinister prim) {
		Transaction tran = session.beginTransaction();
		session.persist(prim);
		tran.commit();
		System.out.println("\nsave successfully .....");
	}

	
}
