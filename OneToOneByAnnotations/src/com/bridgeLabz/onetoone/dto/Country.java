package com.bridgeLabz.onetoone.dto;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Country implements Serializable {
	@Id
	@GenericGenerator(name = "mid", strategy = "increment")
	@GeneratedValue(generator = "mid")
	private int c_id;
	private String c_name;
	private String corrency;
	@OneToOne(cascade = CascadeType.ALL)
	/*@JoinColumn(referencedColumnName = "id")*/
	@PrimaryKeyJoinColumn
	private PrimeMinister pm;

	public PrimeMinister getPm() {
		return pm;
	}

	public void setPm(PrimeMinister pm) {
		this.pm = pm;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getCorrency() {
		return corrency;
	}

	public void setCorrency(String corrency) {
		this.corrency = corrency;
	}

	public Country() {

	}
}
