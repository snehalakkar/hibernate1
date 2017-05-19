package com.bridgeLabz.hqlDemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bridgeLabz.hqlDemo.dto.Mobile;

public class MobileDao {

	Configuration cfg = new AnnotationConfiguration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tran = session.beginTransaction();

	public void save(Mobile mob) {
		session.save(mob);
		System.out.println("save successfully ....");
	}

	public void update() {
		tran = session.beginTransaction();
		Query query = session.createQuery("update Mobile set model = :modelname  where id = :modid");
		query.setParameter("modelname", "lg");
		query.setParameter("modid", 6);
		int result = query.executeUpdate();
		System.out.println("number of record updated :" + result);
		tran.commit();
		System.out.println("update successfull ....");
	}

	public void delete() {
		tran = session.beginTransaction();
		Query query = session.createQuery("delete from Mobile where id = :modid");
		query.setParameter("modid", 3);
		int result = query.executeUpdate();
		System.out.println("number of record deleted " + result);
		tran.commit();
		System.out.println("delete successfull ....");
	}

	public void sumFunction() {

		Query query = session.createQuery("select sum(id) from Mobile");
		List list = query.list();
		System.out.println("sum successfull ....");
		System.out.println("sum of all id :" + list);
	}

	public void maxFunction() {

		Query query = session.createQuery("select max(id) from Mobile");
		int result = (int) query.uniqueResult();
		System.out.println("max successfull ....");
		System.out.println("max of all id :" + result);
	}

	public void minFunction() {

		Query query = session.createQuery("select min(id) from Mobile");
		int result = (int) query.uniqueResult();
		System.out.println("min successfull ....");
		System.out.println("min of all id :" + result);
	}

	public void countFunction() {

		Query query = session.createQuery("select count(id) from Mobile");
		List list = query.list();
		System.out.println("count successfull ....");
		System.out.println("count of all id :" + list);
	}
	
	public void avgFunction() {

		Query query = session.createQuery("select avg(id) from Mobile");
		List list = query.list();
		session.close();
		System.out.println("avg successfull ....");
		System.out.println("avg of all id :" + list);
	}
}
