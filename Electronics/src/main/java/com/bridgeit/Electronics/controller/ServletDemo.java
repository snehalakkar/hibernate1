package com.bridgeit.Electronics.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Electronics.Dao.productDao;
import com.bridgeit.Electronics.Model.Product;
import com.bridgeit.Electronics.Model.ProductDetails;

/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	productDao pdao=new productDao();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String prod_name = req.getParameter("prodname");
		String prodmodel = req.getParameter("prodmodel");
		String prize = req.getParameter("prize");
		System.out.println(prize);
		double prize1=Double.parseDouble(prize);
		System.out.println(prize1);
		Product product=pdao.get(prod_name);
		
		if(product==null){
		 product=new Product();
		 product.setName(prod_name);
		}
		
		ProductDetails detail=new ProductDetails();
		detail.setProd_name(prod_name);
		detail.setModel(prodmodel);
		detail.setPrize(prize1);
		
		Set set=product.getChildren();
		if(set==null){
		 set=new HashSet();
		}
				
		set.add(detail);
		product.setChildren(set);
		pdao.save(product);
		/*
		pw.println("<html><body><p>Do you want to add more Products ?");
		pw.print("<button><a href='index.jsp'>Add Products</a></button></body></html>");*/
		
		resp.sendRedirect("index.jsp");
	}
	}
