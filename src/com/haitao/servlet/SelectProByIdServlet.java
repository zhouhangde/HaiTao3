package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Product;
import com.haitao.service.ProductService;



public class SelectProByIdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productId = request.getParameter("id");
		ProductService pro =new ProductService();
		Product pr=pro.selectProById(Integer.valueOf(productId));
		request.setAttribute("pr", pr);
		request.getRequestDispatcher("updateProduct.jsp").forward(request, response);
		
	}
	

}
