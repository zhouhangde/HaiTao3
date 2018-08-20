package com.haitao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.haitao.entity.Admin;
import com.haitao.entity.Product;
import com.haitao.entity.Roles;

public class AdminDao extends DBManager {
	private Connection con =null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	public List<Admin> SelectAdmin(String name){
		List<Admin> list = new ArrayList<Admin>();
		String sql = "SELECT a.admin_id,b.role_name,a.admin_name,a.admin_pwd FROM admin a,roles b WHERE a.role_id=b.role_id AND admin_name=?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while(rs.next()){
				Admin ad =  new Admin();
				ad.setAdminId(rs.getInt(1));
				Roles ro = new Roles();
				ro.setRoleName(rs.getString(2));
				ad.setRol(ro);
				ad.setAdminName(rs.getString(3));
				ad.setAdminPwd(rs.getString(4));
				list.add(ad);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				super.CloseAll(rs, ps, con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public boolean updateAdmin(Admin ad){
		boolean flag =false;
		String sql = "UPDATE admin SET admin_pwd=? WHERE admin_id =?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, ad.getAdminPwd());
			ps.setInt(2, ad.getAdminId());
			flag = ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				super.CloseAll(null, ps, con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;			
	}
}
