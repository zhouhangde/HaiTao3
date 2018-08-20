package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Sales;
import com.haitao.service.SalesService;

public class PagingSal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SalesService sal=new SalesService();
		String pagestr=request.getParameter("pageIndex");
		int pages=sal.SelectCount();
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
		List<Sales> list=sal.selectPagesales(pageIndex);
		request.setAttribute("list", list);
		request.setAttribute("NowIndex", pageIndex);
		request.setAttribute("pages", pages);
		request.getRequestDispatcher("SalesManager.jsp").forward(request, response);
	}

}
