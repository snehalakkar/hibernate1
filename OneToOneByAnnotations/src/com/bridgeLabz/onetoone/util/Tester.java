package com.bridgeLabz.onetoone.util;

import java.util.Scanner;

import com.bridgeLabz.onetoone.dao.Daoclass;
import com.bridgeLabz.onetoone.dto.Country;
import com.bridgeLabz.onetoone.dto.PrimeMinister;

public class Tester {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Country country=new Country();
	
	System.out.println("enter the country name :");
	String cname=scan.next();
	country.setC_name(cname);
	
	System.out.println("enter the country corrency :");
	String corrency=scan.next();
	country.setCorrency(corrency);
	
	PrimeMinister prim=new PrimeMinister();
	System.out.println("enter the primeminister name :");
	String pname=scan.next();
	prim.setP_name(pname);
	
	System.out.println("enter the primeminister salary :");
	double psal=scan.nextDouble();
	prim.setSal(psal);
	
	prim.setCountry(country);
	//country.setPm(prim);
	
	
	Daoclass dao=new Daoclass();
	dao.save(prim);
}
}
