package com.bridgeit.Electronics.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int count = 1;
		productDao pdao = new productDao();
		PrintWriter pw = resp.getWriter();
		 String prod_name1 = req.getParameter("prodname"); 

		
		// for an existing product
		
			List l1 = pdao.displayAll();
			System.out.println(l1);
			Iterator itr = l1.iterator();

			while (itr.hasNext()) {
				Product p1 = (Product) itr.next();
				if (p1.getName().equalsIgnoreCase(prod_name1)) {

					
					 String prodmodel1 = req.getParameter("prodmodel"); 
					 String  prize11 = req.getParameter("prize"); 
					 double prize2 =Double.parseDouble(prize11);
					String prodbrand1 = req.getParameter("prodbrand");

					ProductDetails detail1 = new ProductDetails();
					detail1.setBrand(prodbrand1);
					detail1.setModel(prodmodel1);
					detail1.setPrize(prize2);
					detail1.setProduct(p1);
					
					pdao.save(detail1);
					count = 0;
					System.out.println("success new product...");
					resp.sendRedirect("index.jsp");
				}
			}
			

			// to add a new product
			if (count == 1) {
				Product product = new Product();
				product.setName(prod_name1);

				String prodmodel = req.getParameter("prodmodel");
				String prize = req.getParameter("prize");
				String prodbrand = req.getParameter("prodbrand");
				System.out.println(prize);
				double prize1 = Double.parseDouble(prize);
				System.out.println(prize1);
				
				ProductDetails detail = new ProductDetails();
				detail.setBrand(prodbrand);
				detail.setModel(prodmodel);
				detail.setPrize(prize1);
				detail.setProduct(product);

				pdao.save(detail);
				System.out.println("success new product...");
				resp.sendRedirect("index.jsp");
			}
		}
	}

