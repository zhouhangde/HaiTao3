package com.haitao.service;

import java.util.List;

import com.haitao.dao.CustomerDao;
import com.haitao.entity.CustomerLogin;
import com.haitao.entity.Product;



public class CustomerService{

	
	public boolean saveCustomer(CustomerLogin customer) throws Exception {
		CustomerDao dao = new CustomerDao();
		return dao.saveCustomer(customer);
	}


	public boolean updateCustomer(CustomerLogin customer) throws Exception {
		CustomerDao dao = new CustomerDao();
		return dao.updateCustomer(customer);
	}

	public boolean deleteCustomerById(Integer customerId) throws Exception {
		CustomerDao dao = new CustomerDao();
		return dao.deleteCustomerById(customerId);
	}

	
	public List<CustomerLogin> selectAllCustomer() throws Exception {
		CustomerDao dao = new CustomerDao();
		return dao.selectAllCustomer();
	}

	
	public CustomerLogin loadCustomerById(Integer CustomerId) throws Exception {
		CustomerDao dao = new CustomerDao();
		return dao.loadCustomerById(CustomerId);
	}

	public int SelectCount() throws Exception{
		CustomerDao dao = new CustomerDao();
		int i =dao.SelectCount();
		int count =(i%10==0)?(i/10):(i/10+1);
		return count;
	}
	
	public List<CustomerLogin> selectPagePro(Integer page) throws Exception{
		CustomerDao dao = new CustomerDao();
		return dao.selectPagePro(page);
	}


	public List<CustomerLogin> selectPageCus(Integer valueOf) {
		// TODO 自动生成的方法存根
		return null;
	}
	public List<CustomerLogin> select_TJ(String tj, String value) throws Exception {
		CustomerDao dao = new CustomerDao();
		return dao.select_TJ(tj, value);
	}
}
