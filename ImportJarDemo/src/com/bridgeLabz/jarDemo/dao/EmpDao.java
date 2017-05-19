package com.bridgeLabz.jarDemo.dao;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.bridgeLabz.jarDemo.dto.Employee;

import antlr.collections.List;
import configJar.SessionConfig;

public class EmpDao {
	SessionFactory factory = SessionConfig.getFactory();
	Session session = factory.getCurrentSession();
	Iterator it;

	public void save(Employee emp) {

		Transaction tran = session.beginTransaction();
		session.persist(emp);
		tran.commit();
		System.out.println("\nsave successfully .....");
	}

	public void update() {
		Session session = factory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		Query qry = session.createQuery("update Employee set name='priyanka' where id=" + 7);
		int res = qry.executeUpdate();
		tran.commit();
		System.out.println(res);
		System.out.println("\nupdate successfully .....");
	}

	public void getAll() {
		System.out.println("\n getall successfully .....");
		Session session = factory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		System.out.println();
		it = (Iterator) c.list().iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.print("\t\tId is :" + emp.getId());
			System.out.print("\t\tName is :" + emp.getName());
			System.out.print("\t\tSalary is :" + emp.getSal());
			System.out.println();
		}
		tran.commit();
	}

	public void salGreater() {
		System.out.println("\n emp with sal greater than 55000 .....");
		Session session = factory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.gt("sal", 35000.00));
		it = (Iterator) c.list().iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.print("\t\tId is :" + emp.getId());
			System.out.print("\t\tName is :" + emp.getName());
			System.out.print("\t\tSalary is :" + emp.getSal());
			System.out.println();
		}
		tran.commit();
	}

	public void ascOrded() {
		System.out.println("\n asc order sal.....");
		Session session = factory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		c.addOrder(Order.asc("sal"));
		/*
		 * java.util.List list = c.list(); Iterator it = ((java.util.List)
		 * list).iterator();
		 */
		it = (Iterator) c.list().iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.print("\t\tId is :" + emp.getId());
			System.out.print("\t\tName is :" + emp.getName());
			System.out.print("\t\tSalary is :" + emp.getSal());
			System.out.println();
		}
		tran.commit();
	}

	public void selectname() {
		System.out.println("\n select name.....");
		Session session = factory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		c.setProjection(Projections.property("name"));
		it = (Iterator) c.list().iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.print("\tName is :" + name);
			System.out.println();
		}
		tran.commit();
	}

	public void selectparticular() {
		System.out.println("\n select particular record.....");
		Session session = factory.getCurrentSession();
		Transaction tran = session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		c.setFirstResult(5);
		c.setMaxResults(12);
		it = (Iterator) c.list().iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.print("\t\tId is :" + emp.getId());
			System.out.print("\t\tName is :" + emp.getName());
			System.out.print("\t\tSalary is :" + emp.getSal());
			System.out.println();
		}
		tran.commit();
	}
}
