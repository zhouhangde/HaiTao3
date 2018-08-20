package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.CustomerLogin;
import com.haitao.service.CustomerService;

public class GoServlet2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		CustomerService cus=new CustomerService();
		String page=request.getParameter("page");
		int pages = 0;
		try {
			pages = cus.SelectCount();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(Integer.valueOf(page)<=pages){
		List<CustomerLogin> list = null;
		try {
			list = cus.selectPagePro(Integer.valueOf(page));
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		request.setAttribute("NowIndex", page);
		request.setAttribute("pages", pages);
		request.getRequestDispatcher("Customer.jsp").forward(request, response);
		}else{
			List<CustomerLogin> list;
			list = cus.selectPageCus(Integer.valueOf(pages));
			request.setAttribute("list", list);
			request.setAttribute("NowIndex", pages);
			request.setAttribute("pages", pages);
			request.getRequestDispatcher("Customer.jsp").forward(request, response);

		
	}

	}
}
