package com.haitao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.haitao.entity.CustomerLogin;
import com.haitao.service.CustomerService;

public class LoadCustomerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
      
		String id=request.getParameter("id");
		    
		CustomerService service = new CustomerService();
		try {
			CustomerLogin customer = service.loadCustomerById(Integer.valueOf(id));
			
			request.setAttribute("customer", customer);
			
			request.getRequestDispatcher("updateCus.jsp").forward(request, response);
			
//			response.sendRedirect("update.jsp");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
