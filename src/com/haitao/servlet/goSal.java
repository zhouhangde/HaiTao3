package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Sales;
import com.haitao.service.SalesService;

public class goSal extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SalesService sal=new SalesService();
		String page=request.getParameter("page");
		int pages=sal.SelectCount();
		if(Integer.valueOf(page)<=pages){
		List<Sales> list = sal.selectPagesales(Integer.valueOf(page));
		request.setAttribute("list", list);
		request.setAttribute("NowIndex", page);
		request.setAttribute("pages", pages);
		request.getRequestDispatcher("SalesManager.jsp").forward(request, response);
		}else{
			List<Sales> list = sal.selectPagesales(Integer.valueOf(pages));
			request.setAttribute("list", list);
			request.setAttribute("NowIndex", pages);
			request.setAttribute("pages", pages);
			request.getRequestDispatcher("SalesManager.jsp").forward(request, response);
		}
	}
}
