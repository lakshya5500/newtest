package com.demoresttremplates.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoresttremplates.model.Product;
import com.demoresttremplates.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> product=productService.findAllProducts();
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Product> saveProducts(@RequestBody Product product){
		Product prod=productService.saveProducts(product);
		return new ResponseEntity<>(prod, HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") Integer id){
		Optional<Product> prod=productService.getProductById(id);
		return new ResponseEntity<>(prod, HttpStatus.OK);
	}
	
}
