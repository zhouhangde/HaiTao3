package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.CustomerLogin;

import com.haitao.service.CustomerService;




public class PagingCusServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CustomerService service = new CustomerService();
		
		String pagestr=request.getParameter("pageIndex");
		int pages = 0;
		try {
			pages = service.SelectCount();
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		request.setAttribute("pages", pages);
		if(pagestr==null||pagestr==""){
			pagestr="1";
		}
		int pageIndex=Integer.valueOf(pagestr);
		if(pageIndex<=1){
			pageIndex=1;
		}else if(pageIndex>=pages){
			pageIndex=pages;
		}
		List<CustomerLogin> list = null;
		try {
			list =service.selectPagePro(pageIndex);
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		request.setAttribute("NowIndex", pageIndex);
		request.getRequestDispatcher("Customer.jsp").forward(request, response);
		
	}
	

}
