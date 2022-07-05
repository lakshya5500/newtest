package com.ecom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Product;
import com.ecom.api.repository.ProductRepo;

@RestController
@CrossOrigin(origins = "*")
public class QueryRestController {
	
	@Autowired
	ProductRepo productRepo;

	@GetMapping("product/mobile")
	public List<Product> getmobile() {
		return productRepo.findBymobile();
	}
	@GetMapping("product/laptop")
	public List<Product> getlaptop() {
		return productRepo.findBylaptop();
	}
	@GetMapping("product/ac")
	public List<Product> getac() {
		return productRepo.findByac();
	}


}
