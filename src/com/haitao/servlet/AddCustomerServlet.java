package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.CustomerLogin;
import com.haitao.service.CustomerService;

public class AddCustomerServlet extends HttpServlet {

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
	
		String customerName=request.getParameter("customerName");
		String customerPwd=request.getParameter("customerPwd");
		String name=request.getParameter("name");
		String customerSex=request.getParameter("customerSex");
		String customerPhone=request.getParameter("customerPhone");
		String customerAddress=request.getParameter("customerAddress");
		String customerMail=request.getParameter("customerMail");
		String customerScore=request.getParameter("customerScore");
		String customerRank=request.getParameter("customerRank");
		String customerMoney=request.getParameter("customerMoney");
		
		CustomerService service = new CustomerService();
		
			try {
						
			     service.saveCustomer(new CustomerLogin(customerName,customerPwd,name,customerSex,customerPhone,customerAddress,customerMail,customerScore,customerRank,customerMoney));	
			    
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
