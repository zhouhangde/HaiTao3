package com.haitao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.haitao.entity.CustomerLogin;


public class CustomerLoginDao extends DBManager {
	private Connection con =null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	public List<CustomerLogin> SelectAllCustomer(){
		List<CustomerLogin> list = new ArrayList<CustomerLogin>();
		String sql = "select * from customer where role_id=2";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				CustomerLogin customer =  new CustomerLogin();
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPwd(rs.getString(4));
				list.add(customer);
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
	public CustomerLogin SelectAllCustomers(String customer_name){
		CustomerLogin customer =  new CustomerLogin();
		String sql = "select * from customer where role_id=2 and customer_name=?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,customer_name);
			rs = ps.executeQuery();
			while(rs.next()){
				
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPwd(rs.getString(4));
				customer.setName(rs.getString(5));
				customer.setCustomerMail(rs.getString(9));
				customer.setCustomerPhone(rs.getString(7));
				customer.setCustomerAddress(rs.getString(8));
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
		return customer;
	}
}
