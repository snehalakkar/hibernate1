package com.bridgeit.Electronics.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.sql.ordering.antlr.Factory;

import com.bridgeit.Electronics.Model.Product;


public class productDao {
	Configuration cfg=new Configuration().configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session = factory.getCurrentSession();
	Transaction tran=session.beginTransaction();
	public void save(Product product) {
		session.saveOrUpdate(product);
		tran.commit();
		System.out.println("save successfull...");
	}
	
	public Product get(String prod_name) {
		System.out.println("hii");
		Query query = session.createQuery("from Product p where p.name=:prod_name ");
		query.setParameter("prod_name", prod_name);
		Product prod = (Product) query.uniqueResult();
		System.out.println(prod);
		return prod;
	}
}
