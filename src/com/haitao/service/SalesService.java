package com.haitao.service;

import java.util.List;

import com.haitao.dao.SalesDao;
import com.haitao.entity.Sales;

public class SalesService {
	SalesDao dao = new SalesDao();
	// 销售记录表更改信息
	public boolean updateSales(Sales sales){
		return dao.updateSales(sales);
		
	}
	// 销售记录表删除信息
	public boolean  deleteSales(Integer SalesId){
		return dao.deleteSales(SalesId);
	}
	// 查询销售记录表
	public List<Sales> selectAllsales(){
		return dao.selectAllSal();
	}
	// 通过订单id查询
	public Sales selectsalesById(Integer  SalesId){
		return dao.selectSalById(SalesId);
	}
	// 选择订单表总行数
	public int SelectCount(){
		int i =dao.SelectCount();
		int count =(i%10==0)?(i/10):(i/10+1);
		return count;
	}
	// 选择订单表当前页数
	public List<Sales> selectPagesales(Integer page){
		return dao.selectPageSal(page);
	}
	// 订单表条件查询
	public List<Sales> select_TJ(String tj, String value) {
		return dao.select_TJ(tj, value);
	}
}
