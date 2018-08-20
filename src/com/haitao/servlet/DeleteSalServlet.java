package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.haitao.service.SalesService;

public class DeleteSalServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String saleId = request.getParameter("id");
		SalesService sal=new SalesService();
		sal.deleteSales(Integer.valueOf(saleId));
		response.sendRedirect("PagingSal");
	}
	
}
