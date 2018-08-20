package com.haitao.servlet;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.haitao.entity.Admin;
import com.haitao.service.AdminService;

public class UpdateAdminServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String adminId = request.getParameter("adminId");
		String adminPwd = request.getParameter("adminPwd");
		AdminService ad = new AdminService();
		if(adminPwd==null||adminPwd==""){
			  JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ�");
			
			response.sendRedirect("SelectAdmin");
		}else{
		ad.updateAdmin(new Admin(Integer.valueOf(adminId),adminPwd));
		JOptionPane.showMessageDialog(null, "�޸ĳɹ��������µ�¼");
		response.sendRedirect("../HaiTao3/ManagerLogin.jsp");
		}
	
	}
	

}
