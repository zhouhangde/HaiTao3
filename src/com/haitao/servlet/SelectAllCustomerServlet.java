package com.haitao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.haitao.entity.CustomerLogin;
import com.haitao.service.CustomerService;

/**
 * 查询所有的学生
 * 
 * @author Administrator
 * 
 */
public class SelectAllCustomerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CustomerService service = new CustomerService();
		try {
			List<CustomerLogin> lstCus = service.selectAllCustomer();

			request.setAttribute("lstCus", lstCus);

			request.getRequestDispatcher("customer.jsp")
					.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
