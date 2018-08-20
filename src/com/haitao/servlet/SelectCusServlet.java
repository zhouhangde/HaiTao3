package com.haitao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.CustomerLogin;

import com.haitao.service.CustomerService;


public class SelectCusServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		CustomerService Cus = new CustomerService();
	    String tj = request.getParameter("select");
	    String value = request.getParameter("value");
	    if(tj.equals("账号")){
	    	tj = "customer_name";
	    }else if(tj.equals("姓名")){
	    	tj = "name";
	    }else if(tj.equals("邮箱")){
	    	tj = "customer_mail";
	    }
	    List<CustomerLogin> list = null;
		try {
			list = Cus.select_TJ(tj, value);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	    request.setAttribute("list", list);
		request.getRequestDispatcher("Customer.jsp").forward(request, response);
	    
	}
	
}
