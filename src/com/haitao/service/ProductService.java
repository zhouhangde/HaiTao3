package com.haitao.service;

import java.util.List;

import com.haitao.dao.ProductDao;
import com.haitao.entity.Product;

public class ProductService {
	ProductDao dao = new ProductDao();
	
	public boolean addProduct(Product pro){
		return dao.addProduct(pro);
		
	}
	
	
	public boolean updateProduct(Product pro){
		return dao.updateProduct(pro);
		
	}
	
	public boolean  deleteProduct(Integer productId){
		return dao.deleteProduct(productId);
	}
	
	public List<Product> selectAllPro(){
		return dao.selectAllPro();
	}
	
	public Product selectProById(Integer  productId){
		return dao.selectProById(productId);
	}
	
	public int SelectCount(){
		int i =dao.SelectCount();
		int count =(i%10==0)?(i/10):(i/10+1);
		return count;
	}
	
	public List<Product> selectPagePro(Integer page){
		return dao.selectPagePro(page);
	}
	
	public List<Product> select_TJ(String tj, String value) {
		return dao.select_TJ(tj, value);
	}
}
