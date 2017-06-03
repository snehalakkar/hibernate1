package com.bridgeit.Electronics.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Product")
public class Product implements Serializable {

	@Id
	@GenericGenerator(name = "mid", strategy = "increment")
	@GeneratedValue(generator = "mid")
	private int prod_id;
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=ProductDetails.class)
	@JoinColumn(name="newp_id",referencedColumnName="prod_id")
	private Set<ProductDetails> children;

	public Set<ProductDetails> getChildren() {
		return children;
	}

	public void setChildren(Set<ProductDetails> children) {
		this.children = children;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product() {

	}
}
