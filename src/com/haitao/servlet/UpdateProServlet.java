package com.haitao.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Product;
import com.haitao.service.ProductService;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;



public class UpdateProServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		SmartUpload su=new SmartUpload();
		su.initialize(getServletConfig(), request, response);
		try {
			su.upload("UTF-8");
			Request surequest = su.getRequest();
			String productId =surequest.getParameter("productId");
			String categoryId =surequest.getParameter("categoryId");
			String storeId =surequest.getParameter("storeId");
			
			String productName =surequest.getParameter("productName");
			String price =surequest.getParameter("price");
			String productPrice =surequest.getParameter("productPrice");
			String productNum =surequest.getParameter("productNum");
			String productDescription =surequest.getParameter("productDescription");
		
			
			
			ProductService pro=new ProductService();
			
			
			 com.jspsmart.upload.File file = su.getFiles().getFile(0);
			String url="./img/"+file.getFileName();
			request.getSession().setAttribute("url", url);
			su.save(request.getServletContext().getRealPath("img"));//ÎÄ¼þ±£´æ 
			
			if(productId == null || productId==""){
				    pro.addProduct(new Product(Integer.valueOf(categoryId),Integer.valueOf(storeId),
					productName,Float.valueOf(price),Float.valueOf(productPrice),Integer.valueOf(productNum),productDescription,url));
			}else{
			pro.updateProduct(new Product(Integer.valueOf(productId),Integer.valueOf(categoryId),Integer.valueOf(storeId),
					productName,Float.valueOf(price),Float.valueOf(productPrice),Integer.valueOf(productNum),productDescription,url));
			}
			response.sendRedirect("PagingPro");	
	}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
