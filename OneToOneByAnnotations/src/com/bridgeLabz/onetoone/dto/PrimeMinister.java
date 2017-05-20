package com.bridgeLabz.onetoone.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class PrimeMinister implements Serializable {
	@Id
	@GenericGenerator(name = "mid", strategy = "increment")
	@GeneratedValue(generator = "mid")
	private int id;
	@Column(name="p_name",length=15)
	private String p_name;
	private double sal;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_id", referencedColumnName = "c_id")
	private Country country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public PrimeMinister() {

	}
}
