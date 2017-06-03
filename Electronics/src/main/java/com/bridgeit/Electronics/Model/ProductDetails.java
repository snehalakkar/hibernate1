package com.bridgeit.Electronics.Model;
 
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="product_Details")
public class ProductDetails implements Serializable{
	@Id
	@GenericGenerator(name="mid",strategy="increment")
	@GeneratedValue(generator="mid")
private int details_id;
private String prod_name;
private String model;
private double prize;

public int getDetails_id() {
	return details_id;
}
public void setDetails_id(int details_id) {
	this.details_id = details_id;
}
public String getProd_name() {
	return prod_name;
}
public void setProd_name(String prod_name) {
	this.prod_name = prod_name;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrize() {
	return prize;
}
public void setPrize(double prize) {
	this.prize = prize;
}

public ProductDetails(){
	
}

}
