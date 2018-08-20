package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Product;
import com.haitao.service.ProductService;

public class SelectProServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		ProductService pro = new ProductService();
	    String tj = request.getParameter("select");
	    String value = request.getParameter("value");
	    if(tj.equals("商品编号")){
	    	tj = "product_id";
	    }else if(tj.equals("品类编号")){
	    	tj = "category_id";
	    }else if(tj.equals("商品名称")){
	    	tj = "product_name";
	    }
	    List<Product> list=pro.select_TJ(tj, value);
	    request.setAttribute("list", list);
		request.getRequestDispatcher("Product.jsp").forward(request, response);
	    
	}

}
