package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Sales;
import com.haitao.service.SalesService;

public class SelectSal extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		SalesService sal = new SalesService();
	    String tj = request.getParameter("select");
	    String value = request.getParameter("value");
	    if(tj.equals("订单编号")){
	    	tj = "sale_id";
	    }else if(tj.equals("会员名称")){
	    	tj = "customer_name";
	    }else if(tj.equals("商品名称")){
	    	tj = "product_name";
	    }
	    List<Sales> list=sal.select_TJ(tj, value);
	    request.setAttribute("list", list);
		request.getRequestDispatcher("SalesManager.jsp").forward(request, response);
	    
	}
}
