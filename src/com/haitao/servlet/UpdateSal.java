package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Sales;
import com.haitao.service.SalesService;

public class UpdateSal extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String saleId =request.getParameter("saleId");
		String customerName =request.getParameter("customerName");
		String productName =request.getParameter("productName");
		String productPrice =request.getParameter("productPrice");
		String buyPrice =request.getParameter("buyPrice");
		String discount =request.getParameter("discount");
		String saleCount =request.getParameter("saleCount");
		String saleTime =request.getParameter("saleTime");
		SalesService sal=new SalesService();
		sal.updateSales(new Sales(Integer.valueOf(saleId),customerName,productName,productPrice,buyPrice,discount,saleCount,saleTime));
		response.sendRedirect("PagingSal");
	}
}
