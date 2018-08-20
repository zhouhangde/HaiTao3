package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Product;
import com.haitao.service.ProductService;

public class goServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService pro=new ProductService();
		String page=request.getParameter("page");
		int pages=pro.SelectCount();
		if(Integer.valueOf(page)<=pages){
		List<Product> list;
		list = pro.selectPagePro(Integer.valueOf(page));
		request.setAttribute("list", list);
		request.setAttribute("NowIndex", page);
		request.setAttribute("pages", pages);
		request.getRequestDispatcher("Product.jsp").forward(request, response);
		}else{
			List<Product> list;
			list = pro.selectPagePro(Integer.valueOf(pages));
			request.setAttribute("list", list);
			request.setAttribute("NowIndex", pages);
			request.setAttribute("pages", pages);
			request.getRequestDispatcher("Product.jsp").forward(request, response);
		}
	}

}
