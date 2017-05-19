package com.bridgeLabz.Hql.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Bottle_Demo")
public class Bottle implements Serializable {
	@Id
	@GenericGenerator(name="generate" , strategy="increment")
	@GeneratedValue(generator="generate")
	private int id;
	private String color;
	private double prize;
	
	public Bottle() {
		System.out.println(Bottle.class + " created ");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

}
