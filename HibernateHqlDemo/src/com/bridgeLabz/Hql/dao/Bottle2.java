package com.bridgeLabz.Hql.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeLabz.Hql.dto.Bottle;

public class Bottle2 {
	public void save(Bottle b1) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Bottle.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran=session.beginTransaction();
		session.save(b1);
		tran.commit();
		session.close();
	}

}
