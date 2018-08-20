package com.haitao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.haitao.service.CustomerService;

public class DeleteCustomerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String customerId= request.getParameter("id");
		CustomerService service = new CustomerService();
		try {
			service.deleteCustomerById(Integer.valueOf(customerId));
			response.setContentType("text/html;charset=utf-8");
			response.sendRedirect("PagingCus");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
