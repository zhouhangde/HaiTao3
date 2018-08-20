package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Sales;
import com.haitao.service.SalesService;

public class SelectSalById extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String saleId = request.getParameter("id");
		SalesService sal =new SalesService();
		Sales sa=sal.selectsalesById(Integer.valueOf(saleId));
		request.setAttribute("sa", sa);
		request.getRequestDispatcher("updateSales.jsp").forward(request, response);
		
	}
}
