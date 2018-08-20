package com.haitao.service;

import java.util.List;

import com.haitao.dao.AdminDao;
import com.haitao.entity.Admin;

public class AdminService {
	AdminDao dao = new AdminDao();
	public List<Admin> SelectAdmin(String name){
		return dao.SelectAdmin(name);
	}
	public boolean updateAdmin(Admin ad){
		return dao.updateAdmin(ad);
	}
}
