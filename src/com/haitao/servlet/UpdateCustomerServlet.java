package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.haitao.entity.CustomerLogin;
import com.haitao.service.CustomerService;

public class UpdateCustomerServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		request.setCharacterEncoding("UTF-8");
		/*response.setCharacterEncoding("UTF-8");*/
		String customerId=request.getParameter("customerId");
		String customerName=request.getParameter("customerName");
		String customerPwd=request.getParameter("customerPwd");
		String name=request.getParameter("name");
		String customerSex=request.getParameter("customerSex");
		String customerPhone=request.getParameter("customerPhone");
		String customerAddress=request.getParameter("customerAddress");
		String customerMail=request.getParameter("customerMail");
		String customerScore=request.getParameter("customerScore");
		String customerRank=request.getParameter("customerRank");
		Float a=Float.valueOf(request.getParameter("customerMoney"));
		Float b=Float.valueOf(request.getParameter("addMoney"));
		String customerMoney=String.valueOf(a+b);
		CustomerService service = new CustomerService();
		try {
					
		     service.updateCustomer(new CustomerLogin(customerName,customerPwd,name,customerSex,customerPhone,customerAddress,customerMail,customerScore,customerRank,customerMoney,Integer.valueOf(customerId)));	
		     
		     response.sendRedirect("PagingCus");
		}
		
		catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
