package com.haitao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.haitao.entity.Product;
import com.haitao.entity.Sales;

public class SalesDao extends DBManager{
	private Connection con= null;
	private PreparedStatement ps= null;
	private ResultSet rs =null;
	// 销售记录表更改信息
	public boolean updateSales(Sales sales){
		boolean flag =false;
		String sql = "UPDATE sales SET customer_name=?,product_name=?,product_price=?,buy_price=?,discount=?,sale_count=?,sale_time=? WHERE sale_id =?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, sales.getCustomerName());
			ps.setString(2, sales.getProductName());
			ps.setString(3, sales.getProductPrice());
			ps.setString(4, sales.getBuyPrice());
			ps.setString(5, sales.getDiscount());
			ps.setString(6, sales.getSaleCount());
			ps.setString(7, sales.getSaleTime());
			ps.setInt(8, sales.getSaleId());
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
	// 销售记录表删除信息
	public boolean  deleteSales(Integer saleId){
		boolean flag =false;
		String sql = "DELETE FROM sales WHERE sale_id =?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, saleId);
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
	// 查询销售记录表
	public List<Sales> selectAllSal(){
		String sql = "select * from sales";
		List<Sales> list = new ArrayList<Sales>();
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Sales sales = new Sales();
				sales.setSaleId(rs.getInt(1));
				sales.setCustomerName(rs.getString(2));
				sales.setProductName(rs.getString(3));
				sales.setProductPrice(rs.getString(4));
				sales.setBuyPrice(rs.getString(5));
				sales.setDiscount(rs.getString(6));
				sales.setSaleCount(rs.getString(7));
				sales.setSaleTime(rs.getString(8));
				list.add(sales);
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
	// 通过订单id查询
	public Sales selectSalById(Integer saleId){
		String sql = "select * from sales where sale_id =?";
		Sales sales = new Sales();
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, saleId);
			rs = ps.executeQuery();
			while(rs.next()){
				sales.setSaleId(rs.getInt(1));
				sales.setCustomerName(rs.getString(2));
				sales.setProductName(rs.getString(3));
				sales.setProductPrice(rs.getString(4));
				sales.setBuyPrice(rs.getString(5));
				sales.setDiscount(rs.getString(6));
				sales.setSaleCount(rs.getString(7));
				sales.setSaleTime(rs.getString(8));
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
		return sales;
	}
	// 选择订单表总行数
	public int SelectCount(){
		int i = 0;
		String sql = "select count(*) from sales";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				i = rs.getInt(1);
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
		return i;
	}
	// 选择订单表当前页数
	public List<Sales> selectPageSal(Integer page){
		String sql="SELECT * FROM sales  LIMIT ?,10";
		List<Sales> list=new ArrayList<Sales>();
		try {
			con=DBManager.getconnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, (page-1)*10);
			rs=ps.executeQuery();
			while(rs.next()){
				Sales sales = new Sales();
				sales.setSaleId(rs.getInt(1));
				sales.setCustomerName(rs.getString(2));
				sales.setProductName(rs.getString(3));
				sales.setProductPrice(rs.getString(4));
				sales.setBuyPrice(rs.getString(5));
				sales.setDiscount(rs.getString(6));
				sales.setSaleCount(rs.getString(7));
				sales.setSaleTime(rs.getString(8));
				list.add(sales);
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
	// 订单表条件查询
	public List<Sales> select_TJ(String tj, String value) {
		String sql = "select * from sales where "+tj+" like ?";
		List<Sales> list = new ArrayList<Sales>();
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + value + "%");
			rs = ps.executeQuery();
			while(rs.next()){
				Sales sales = new Sales();
				sales.setSaleId(rs.getInt(1));
				sales.setCustomerName(rs.getString(2));
				sales.setProductName(rs.getString(3));
				sales.setProductPrice(rs.getString(4));
				sales.setBuyPrice(rs.getString(5));
				sales.setDiscount(rs.getString(6));
				sales.setSaleCount(rs.getString(7));
				sales.setSaleTime(rs.getString(8));
				list.add(sales);
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
}
