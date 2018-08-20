package com.haitao.entity;

public class Sales {
	private Integer saleId;
	private String customerName;
	private String productName;
	private String productPrice;
	private String buyPrice;
	private String discount;
	private String saleCount;
	private String saleTime;
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(String saleCount) {
		this.saleCount = saleCount;
	}
	public String getSaleTime() {
		return saleTime;
	}
	public void setSaleTime(String saleTime) {
		this.saleTime = saleTime;
	}
	public Sales(Integer saleId, String customerName, String productName,
			String productPrice, String buyPrice, String discount,
			String saleCount, String saleTime) {
		this.saleId = saleId;
		this.customerName = customerName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.buyPrice = buyPrice;
		this.discount = discount;
		this.saleCount = saleCount;
		this.saleTime = saleTime;
	}
	public Sales() {
	}
	
	
}
