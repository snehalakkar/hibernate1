package com.bridgeLabz.mappingDemo.dto;

import java.io.Serializable;

public class Address implements Serializable{
private int add_id;
private String city;
private int pincode;
private Employee emp;


public int getAdd_id() {
	return add_id;
}
public void setAdd_id(int add_id) {
	this.add_id = add_id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Employee getEmp() {
	return emp;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}

public Address(){
	
}
}
