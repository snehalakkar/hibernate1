package com.bridgeLabz.hibernateDemo.util;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bridgeLabz.hibernateDemo.dao.EmpDao;
import com.bridgeLabz.hibernateDemo.dto.Employee;

public class StoreData {
public static void main(String[] args) {
	
	Employee e1=new Employee();
	/*e1.setId(5);*/
	e1.setFname("siya");
	e1.setLname("ram");
	
	
	EmpDao d1=new EmpDao();
	d1.save(e1);
	d1.update(8,"siya1");
	/*d1.delete(5);
	*/
	d1.fetch();
	d1.fetch1(5);

	System.out.println("successfully saved ...");
}
}
