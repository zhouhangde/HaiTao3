package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Product;
import com.haitao.service.ProductService;



public class PagingProServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService pro=new ProductService();
		String pagestr=request.getParameter("pageIndex");
		int pages=pro.SelectCount();
		 /*用于请求的参数传递到jsp界面*/
		request.setAttribute("pages", pages);
		if(pagestr==null||pagestr==""){
			pagestr="1";
		}
		/*转化为int类型*/
		int pageIndex=Integer.valueOf(pagestr);
		if(pageIndex<=1){
			pageIndex=1;
		}else if(pageIndex>=pages){
			pageIndex=pages;
		}
		List<Product> list;
		list = pro.selectPagePro(pageIndex);
		request.setAttribute("list", list);
		request.setAttribute("NowIndex", pageIndex);
		request.setAttribute("pages", pages);
		/*前面产生一个请求分发器对象，它的方法forward(request,response)作用是将请求转发到Product.jsp，request封装了请求信息，response封装了响应信息。注意是forward方式，这种方式只转发请求，不产生新的request对象。*/
		request.getRequestDispatcher("Product.jsp").forward(request, response);
		
	}
	

}
