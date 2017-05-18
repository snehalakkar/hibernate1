package com.bridgeLabz.hibernateDemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bridgeLabz.hibernateDemo.dto.Employee;

public class EmpDao {

	SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	
		public void save(Employee employee) {
			session.save(employee);
			System.out.println("save successfull ...");
		}

		public void update(int id, String fname) {
			Employee e = (Employee) session.get(Employee.class, id);
			e.setFname(fname);
			session.persist(e);
			System.out.println("update successfull ...");

		}

		public void delete(int id) {
			Employee e = (Employee) session.get(Employee.class, id);
			session.delete(e);
			System.out.println("delete successfull ...");

		}
		
		public void fetch() {
			Query query = session.createQuery("from Employee");
	        List list = query.list();

	        for(Object o1:list){
	        	
	        	System.out.println(o1);
	        	System.out.println();
	        }
			System.out.println("all data fetch successfull ...");
	    }
		
		public void fetch1(int id) {
			Employee e = (Employee) session.get(Employee.class, id);
			Query query = session.createQuery("from Employee where id=:id");
			/*Query query1 = session.createQuery("from Employee where id="+id);*/
			query.setParameter("id", id);

	        System.out.println("new id :"+query.list());
			System.out.println("particular data fetch successfull ...");

	       /* for(Object o1:list){
	        	
	        	System.out.println(o1);
	        	System.out.println();
	        }*/
			transaction.commit();
			session.close();
			
	    }
		}
	/*
	 * public void save(Employee emp) {
	 * 
	 * Configuration cfg = new Configuration().configure();
	 * 
	 * SessionFactory factory = cfg.buildSessionFactory(); Session session =
	 * factory.openSession(); Transaction transaction =
	 * session.beginTransaction(); session.save(emp); transaction.commit();
	 * session.close(); factory.close(); }
	 */

