package com.haitao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.haitao.entity.Product;



public class ProductDao extends DBManager{
	private Connection con= null;
	private PreparedStatement ps= null;
	private ResultSet rs =null;
	//ÃÌº”…Ã∆∑
	public boolean addProduct(Product pro){
		boolean flag =false;
		String sql = "INSERT INTO products (category_id,store_id,product_name,price,product_price,product_num,product_description,product_image) VALUES (?,?,?,?,?,?,?,?)";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getCategoryId());
			ps.setInt(2, pro.getStoreId());
			ps.setString(3, pro.getProductName());
			ps.setFloat(4, pro.getPrice());
			ps.setFloat(5, pro.getProductPrice());
			ps.setInt(6, pro.getProductNum());
			ps.setString(7, pro.getproductDescription());
			ps.setString(8, pro.getProductImage());
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
	
	
	
	public boolean updateProduct(Product pro){
		boolean flag =false;
		String sql = "UPDATE products SET category_id=?,store_id=?,product_name=?,price=?,product_price=?,product_num=?,product_description=?,product_image=? WHERE product_id =?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getCategoryId());
			ps.setInt(2, pro.getStoreId());
			ps.setString(3, pro.getProductName());
			ps.setFloat(4, pro.getPrice());
			ps.setFloat(5, pro.getProductPrice());
			ps.setInt(6, pro.getProductNum());
			ps.setString(7, pro.getproductDescription());
			ps.setString(8, pro.getProductImage());
			ps.setInt(9, pro.getProductId());
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
	
	
	
	public boolean  deleteProduct(Integer productId){
		boolean flag =false;
		String sql = "DELETE FROM products WHERE product_id =?";
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
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
	
	
	public List<Product> selectAllPro(){
		String sql = "select * from products";
		List<Product> list = new ArrayList<Product>();
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Product pro = new Product();
				pro.setProductId(rs.getInt(1));
				pro.setCategoryId(rs.getInt(2));
				pro.setStoreId(rs.getInt(3));
				pro.setProductName(rs.getString(4));
				pro.setPrice(rs.getFloat(5));
				pro.setProductPrice(rs.getFloat(6));
				pro.setProductNum(rs.getInt(7));
				pro.setproductDescription(rs.getString(8));
				pro.setProductImage(rs.getString(9));
				list.add(pro);
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
	
	
	public Product selectProById(Integer  productId){
		String sql = "select * from products where product_id =?";
		Product pro = new Product();
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			rs = ps.executeQuery();
			while(rs.next()){
				pro.setProductId(rs.getInt(1));
				pro.setCategoryId(rs.getInt(2));
				pro.setStoreId(rs.getInt(3));
				pro.setProductName(rs.getString(4));
				pro.setPrice(rs.getFloat(5));
				pro.setProductPrice(rs.getFloat(6));
				pro.setProductNum(rs.getInt(7));
				pro.setproductDescription(rs.getString(8));
				pro.setProductImage(rs.getString(9));
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
		return pro;
	}
	
	
	public int SelectCount(){
		int i = 0;
		String sql = "select count(*) from products";
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
	
	public List<Product> selectPagePro(Integer page){
		String sql="SELECT * FROM products  LIMIT ?,10";
		List<Product> list=new ArrayList<Product>();
		try {
			con=DBManager.getconnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, (page-1)*10);
			rs=ps.executeQuery();
			while(rs.next()){
				Product pro = new Product();
				pro.setProductId(rs.getInt(1));
				pro.setCategoryId(rs.getInt(2));
				pro.setStoreId(rs.getInt(3));
				pro.setProductName(rs.getString(4));
				pro.setPrice(rs.getFloat(5));
				pro.setProductPrice(rs.getFloat(6));
				pro.setProductNum(rs.getInt(7));
				pro.setproductDescription(rs.getString(8));
				pro.setProductImage(rs.getString(9));
				list.add(pro);
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
	public List<Product> select_TJ(String tj, String value) {
		String sql = "select * from products where "+tj+" like ?";
		List<Product> list = new ArrayList<Product>();
		try {
			con = DBManager.getconnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + value + "%");
			rs = ps.executeQuery();
			while(rs.next()){
				Product pro = new Product();
				pro.setProductId(rs.getInt(1));
				pro.setCategoryId(rs.getInt(2));
				pro.setStoreId(rs.getInt(3));
				pro.setProductName(rs.getString(4));
				pro.setPrice(rs.getFloat(5));
				pro.setProductPrice(rs.getFloat(6));
				pro.setProductNum(rs.getInt(7));
				pro.setproductDescription(rs.getString(8));
				pro.setProductImage(rs.getString(9));
				list.add(pro);
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
