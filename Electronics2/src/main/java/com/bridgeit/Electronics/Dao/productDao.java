package com.bridgeit.Electronics.Dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.bridgeit.Electronics.Model.Product;
import com.bridgeit.Electronics.Model.ProductDetails;

public class productDao {
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	

	public void save(ProductDetails details) {
		Transaction tran = session.beginTransaction();
		session.save(details);
		System.out.println("save successfull...");
		tran.commit();
	}

	public List displayAll() {
		Query query = session.createQuery("from Product");
		List list = query.list();
		System.out.println(list);
		return list;
	}
	
	public Product get(String prod_name) {
		Query query = session.createQuery("from Product p where p.name=:prod_name ");
		query.setParameter("prod_name", prod_name);
		Product prod = (Product) query.uniqueResult();
		System.out.println(prod);
		return prod;
	}
}
