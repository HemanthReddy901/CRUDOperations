package com.jdbc.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDB 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
   public String insert(Product p)
   {
	   String sql="insert into products values(?,?,?,?)";
	   jdbcTemplate.update(sql, p.productId,p.productName,p.productCategory,p.productPrice);
	   return "Inserted Successfully";
	   
   }
   
   public String update(Product p)
   {
	   String sql="update products set product_name=? ,product_category=? ,product_price=? where product_id=?";
	   jdbcTemplate.update(sql, p.productName,p.productCategory,p.productPrice,p.productId);
	   return "Updated Successfully";
   }
   
   public String delete(int productId)
   {
	   String sql="delete from products where product_id=?";
	   jdbcTemplate.update(sql, productId);
	   return "Deleted Successfully";
   }
   
   public Product getProductById(int productId)
   {
	   String sql="SELECT * FROM products WHERE product_id=?";
	 return jdbcTemplate.queryForObject(sql, (rs,rowcount) -> {
		   Product p=new Product(rs.getInt("product_id"),rs.getString("product_name"),rs.getString("product_category"),rs.getDouble("product_price"));
		   return p;
	   }, productId);
   }
   
   public List<Product> getAllProducts()
   {
	   String sql="SELECT * FROM products";
	   return jdbcTemplate.query(sql, (rs, rowcount) -> {
		   Product p=new Product(rs.getInt("product_id"),rs.getString("product_name"),rs.getString("product_category"),rs.getDouble("product_price"));
		   return p;
	   });
   }
}
