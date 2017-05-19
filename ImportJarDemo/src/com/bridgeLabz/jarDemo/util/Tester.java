package com.bridgeLabz.jarDemo.util;


import com.bridgeLabz.jarDemo.dao.EmpDao;
import com.bridgeLabz.jarDemo.dto.Employee;

public class Tester {
public static void main(String[] args) {
	Employee e1=new Employee();
	/*e1.setId(1);*/
	e1.setName("mittal");
	e1.setSal(50000.00);
	
	EmpDao edao=new EmpDao();
	/*edao.save(e1);*/
	/*edao.update();*/
	edao.getAll();
	edao.salGreater();
	edao.ascOrded();
	edao.selectname();
	edao.selectparticular();
}
}
