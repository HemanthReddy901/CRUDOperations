package com.jdbc.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController 
{
	@Autowired
	ProductDB productDB;
   @PostMapping("/insert")
   public String insert(@RequestBody Product p)
   {
	   String s=productDB.insert(p);
	   return s;
   }
   @PostMapping("/update")
   
	   public String update(@RequestBody Product p)
	   {
		   return productDB.update(p);  
	   }
   @GetMapping("/delete")
   public String delete(@RequestParam int productId)
   {
	   return productDB.delete(productId);
   }
    @GetMapping("/productById")
    public Product getProductsById(@RequestParam int productId)
    {
    	 return productDB.getProductById(productId); 	
    }
     
    @GetMapping("/allProducts")
    public List<Product> getAllProducts()
    {
    	 return productDB.getAllProducts();    }
   }

