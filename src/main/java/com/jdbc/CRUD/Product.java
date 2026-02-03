package com.jdbc.CRUD;

import org.springframework.stereotype.Component;

@Component
public class Product 
{
  int productId;
  String productName;
  String productCategory;
  double productPrice;
  public Product() {}
  public Product(int productId, String productName, String productCategory, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productPrice = productPrice;
}
  public int getProductId() {
	return productId;
  }
  public void setProductId(int productId) {
	this.productId = productId;
  }
  public String getProductName() {
	return productName;
  }
  public void setProductName(String productName) {
	this.productName = productName;
  }
  public String getProductCategory() {
	return productCategory;
  }
  public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
  }
  public double getProductPrice() {
	return productPrice;
  }
  public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
  }
  
}
