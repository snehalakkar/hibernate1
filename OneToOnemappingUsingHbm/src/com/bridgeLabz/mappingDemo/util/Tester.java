package com.bridgeLabz.mappingDemo.util;

import com.bridgeLabz.mappingDemo.dao.DaoLogic;
import com.bridgeLabz.mappingDemo.dto.Address;
import com.bridgeLabz.mappingDemo.dto.Employee;

public class Tester {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmp_name("snehal");
	emp.setEmail("snel@gmail.com");
	
	Address add=new Address();
	add.setCity("nasik");
	add.setPincode(422206);
	
	emp.setAdr(add);
	add.setEmp(emp);
	
	System.out.println("emp contains :"+emp);
	
	DaoLogic dao=new DaoLogic();
	dao.save(emp);
}
}
