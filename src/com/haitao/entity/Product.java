package com.haitao.entity;

public class Product {
	private Integer productId;
	private Integer categoryId;
	private Integer storeId;
	private String productName;
	private Float price;
	private Float productPrice;
	private Integer productNum;
	private String productDescription;
	private String productImage;
	private Category cate;
	
	public Product() {
	}

	
	
	
	public Product(Integer categoryId, Integer storeId, String productName,
			Float price, Float productPrice, Integer productNum,
			String productDescription, String productImage) {
		this.categoryId = categoryId;
		this.storeId = storeId;
		this.productName = productName;
		this.price = price;
		this.productPrice = productPrice;
		this.productNum = productNum;
		this.productDescription = productDescription;
		this.productImage = productImage;
		
	}




	public Product(Integer productId, Integer categoryId, Integer storeId,
			String productName, Float price, Float productPrice,
			Integer productNum, String productDescription, String productImage) {
		this.productId = productId;
		this.categoryId = categoryId;
		this.storeId = storeId;
		this.productName = productName;
		this.price = price;
		this.productPrice = productPrice;
		this.productNum = productNum;
		this.productDescription = productDescription;
		this.productImage = productImage;
	}




	public Product(Integer productId, Integer categoryId, Integer storeId,
			String productName, Float price, Float productPrice,
			Integer productNum, String productDescription,
			String productImage, Category cate) {
		this.productId = productId;
		this.categoryId = categoryId;
		this.storeId = storeId;
		this.productName = productName;
		this.price = price;
		this.productPrice = productPrice;
		this.productNum = productNum;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.cate = cate;
	}



	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductNum() {
		return productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}

	public String getproductDescription() {
		return productDescription;
	}

	public void setproductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Category getCate() {
		return cate;
	}

	public void setCate(Category cate) {
		this.cate = cate;
	}
	
	
	
	
	
	
	

}
