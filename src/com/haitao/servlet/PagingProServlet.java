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
		 /*��������Ĳ������ݵ�jsp����*/
		request.setAttribute("pages", pages);
		if(pagestr==null||pagestr==""){
			pagestr="1";
		}
		/*ת��Ϊint����*/
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
		/*ǰ�����һ������ַ����������ķ���forward(request,response)�����ǽ�����ת����Product.jsp��request��װ��������Ϣ��response��װ����Ӧ��Ϣ��ע����forward��ʽ�����ַ�ʽֻת�����󣬲������µ�request����*/
		request.getRequestDispatcher("Product.jsp").forward(request, response);
		
	}
	

}
