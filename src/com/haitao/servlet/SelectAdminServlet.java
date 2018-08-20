package com.haitao.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haitao.entity.Admin;
import com.haitao.service.AdminService;

public class SelectAdminServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String adminName = request.getSession().getAttribute("login").toString();
		AdminService ad = new AdminService();
		List<Admin> list = ad.SelectAdmin("adminName");
		request.setAttribute("list", list);
		request.getRequestDispatcher("Admin.jsp").forward(request, response);
	}
	

}
