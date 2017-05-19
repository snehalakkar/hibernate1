package com.bridgeLabz.hqlDemo.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class Mobile implements Serializable {

	public Mobile(){
		System.out.println(Mobile.class+" created ");
	}
	@Id
	@GenericGenerator(name="mid",strategy="increment")
	@GeneratedValue(generator="mid")
	
	private int id;
	private String model;
	private double prize;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
