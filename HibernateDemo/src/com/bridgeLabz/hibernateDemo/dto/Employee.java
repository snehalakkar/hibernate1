package com.bridgeLabz.hibernateDemo.dto;

import java.io.Serializable;

public class Employee implements Serializable{
		
private int id;
private String fname;
private String lname;
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

}