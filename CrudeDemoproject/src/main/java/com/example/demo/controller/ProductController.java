package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addproduct")
	public product addProduct(@RequestBody product product) {
		System.out.println("testing the  controller");
		return service.saveProduct(product);
	}
	
	@PostMapping("/addproducts")
	public List<product> addProduct(@RequestBody List<product> product) {
		return service.saveProducts(product);
	}
	
	
	@GetMapping("/products")
	public List<product> findAllProducts(){
		return service.getProducts();
	}
	@GetMapping("/productById/{Id}")
	public product findProductById(@PathVariable int Id) {
		return service.getProductById(Id);
	}
	@GetMapping("/product/{name}")
	 public product findProductByName(@PathVariable String name) {
		 return service.getProductByName(name);
	 }
	
	
	@PutMapping("/update")
	public product updateProduct(@RequestBody product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete{Id}")
	public String deleteProduct(@PathVariable int Id) {
		return service.deleteProduct(Id);
	}
}
