package com.bridgeLabz.mappingDemo.dto;

import java.io.Serializable;

public class Employee implements Serializable{
private int emp_id;
private String emp_name;
private String email;
private Address adr;


public Address getAdr() {
	return adr;
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", email=" + email + ", adr=" + adr + "]";
}
public void setAdr(Address adr) {
	this.adr = adr;
}


public int getEmp_id() { 
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}


public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public Employee(){
	
}

}
