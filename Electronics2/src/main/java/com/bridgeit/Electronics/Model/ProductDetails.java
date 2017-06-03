package com.bridgeit.Electronics.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="product_Details")
public class ProductDetails implements Serializable{
	@Id
	@GenericGenerator(name="mid",strategy="increment")
	@GeneratedValue(generator="mid")
private int details_id;
private String brand;
private String model;
private double prize;

@ManyToOne(cascade=CascadeType.ALL)
private Product product;

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public int getDetails_id() {
	return details_id;
}
public void setDetails_id(int details_id) {
	this.details_id = details_id;
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
