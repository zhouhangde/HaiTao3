package com.haitao.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.util.ArrayList;
import java.util.List;

import com.haitao.entity.CustomerLogin;





public class CustomerDao{

	public boolean saveCustomer(CustomerLogin customer) throws Exception {
		String sql = "insert into customer(customer_name,customer_pwd,name,customer_sex,customer_phone,customer_address,customer_mail,customer_score,customer_rank,customer_money) values(?,?,?,?,?,?,?,?,?,?)";
		Connection conn = DBManager.getconnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, customer.getCustomerName());
		ps.setString(2, customer.getCustomerPwd());
		ps.setString(3, customer.getName());
		ps.setString(4, customer.getCustomerSex());
		ps.setString(5, customer.getCustomerPhone());
		ps.setString(6, customer.getCustomerAddress());
		ps.setString(7, customer.getCustomerMail());
		ps.setString(8, customer.getCustomerScore());
		ps.setString(9, customer.getCustomerRank());
		ps.setString(10, customer.getCustomerMoney());
		boolean flag = ps.execute();
		ps.close();
		conn.close();
		return flag;
	}


	public boolean updateCustomer(CustomerLogin customer) throws Exception {
		String sql = "UPDATE customer SET customer_name = ?,customer_pwd = ?,name = ?,customer_sex = ?,customer_phone = ?,customer_address = ? ,customer_mail = ?,customer_score=?,customer_rank=?,customer_money=? WHERE customer_id= ?";
		Connection conn = DBManager.getconnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, customer.getCustomerName());
		ps.setString(2, customer.getCustomerPwd());
		ps.setString(3, customer.getName());
		ps.setString(4, customer.getCustomerSex());
		ps.setString(5, customer.getCustomerPhone());
		ps.setString(6, customer.getCustomerAddress());
		ps.setString(7, customer.getCustomerMail());
		ps.setString(8, customer.getCustomerScore());
		ps.setString(9, customer.getCustomerRank());
		ps.setString(10, customer.getCustomerMoney());
		ps.setInt(11, customer.getCustomerId());
		
		boolean flag = ps.execute();
		ps.close();
		conn.close();
		return flag;
	}


	public boolean deleteCustomerById(Integer customerId) throws Exception {
		String sql = "DELETE FROM customer WHERE customer_id=?";
		Connection conn =DBManager.getconnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, customerId);
		boolean flag = ps.execute();
		ps.close();
		conn.close();
		return flag;
	}


	public List<CustomerLogin> selectAllCustomer() throws Exception {
		String sql = "select * from customer";
		Connection conn =DBManager.getconnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<CustomerLogin> lstCus = new ArrayList<CustomerLogin>();
		while (rs.next()) {
			CustomerLogin customer = new CustomerLogin();
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(3));
			customer.setCustomerPwd(rs.getString(4));
			customer.setName(rs.getString(5));
			customer.setCustomerSex(rs.getString(6));
			customer.setCustomerPhone(rs.getString(7));
			customer.setCustomerAddress(rs.getString(8));
			customer.setCustomerMail(rs.getString(9));
			customer.setCustomerScore(rs.getString(10));
			customer.setCustomerRank(rs.getString(11));
			customer.setCustomerMoney(rs.getString(12));
			lstCus.add(customer);
		}
		ps.close();
		conn.close();
		return lstCus;
	}


	public CustomerLogin loadCustomerById(Integer CustomerId) throws Exception {
		String sql = "select * from customer where customer_id= ?";
		Connection conn = DBManager.getconnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,CustomerId);
		ResultSet rs = ps.executeQuery();
		CustomerLogin customer = new CustomerLogin();
		while (rs.next()) {
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(3));
			customer.setCustomerPwd(rs.getString(4));
			customer.setName(rs.getString(5));
			customer.setCustomerSex(rs.getString(6));
			customer.setCustomerPhone(rs.getString(7));
			customer.setCustomerAddress(rs.getString(8));
			customer.setCustomerMail(rs.getString(9));
			customer.setCustomerScore(rs.getString(10));
			customer.setCustomerRank(rs.getString(11));
			customer.setCustomerMoney(rs.getString(12));
		}
		ps.close();
		conn.close();
		return customer;
	}

	public int SelectCount() throws Exception {
		int i = 0;
		String sql = "select count(*) from customer";
			Connection conn = DBManager.getconnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				i = rs.getInt(1);
			}
		
		ps.close();
		conn.close();
		return i;
		
	}
	
	public List<CustomerLogin> selectPagePro(Integer page) throws Exception {
		String sql="SELECT * FROM customer  LIMIT ?,10";
		List<CustomerLogin> list=new ArrayList<CustomerLogin>();
		
			Connection conn = DBManager.getconnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, (page-1)*10);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				CustomerLogin customer = new CustomerLogin();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPwd(rs.getString(4));
				customer.setName(rs.getString(5));
				customer.setCustomerSex(rs.getString(6));
				customer.setCustomerPhone(rs.getString(7));
				customer.setCustomerAddress(rs.getString(8));
				customer.setCustomerMail(rs.getString(9));
				customer.setCustomerScore(rs.getString(10));
				customer.setCustomerRank(rs.getString(11));
				customer.setCustomerMoney(rs.getString(12));
				list.add(customer);
			}
			ps.close();
			conn.close();
		return list;
	}
	
	public List<CustomerLogin> select_TJ(String tj, String value) throws Exception {
		String sql = "select * from customer where "+tj+" like ?";
		List<CustomerLogin> list = new ArrayList<CustomerLogin>();
	
			Connection conn = DBManager.getconnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + value + "%");
			ResultSet	rs = ps.executeQuery();
			while(rs.next()){
				CustomerLogin customer = new CustomerLogin();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPwd(rs.getString(4));
				customer.setName(rs.getString(5));
				customer.setCustomerSex(rs.getString(6));
				customer.setCustomerPhone(rs.getString(7));
				customer.setCustomerAddress(rs.getString(8));
				customer.setCustomerMail(rs.getString(9));
				customer.setCustomerScore(rs.getString(10));
				customer.setCustomerRank(rs.getString(11));
				customer.setCustomerMoney(rs.getString(12));
				list.add(customer);
			}
			ps.close();
			conn.close();
		return list;
	}
}
