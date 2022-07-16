package com.demoresttremplates.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoresttremplates.model.Product;
import com.demoresttremplates.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public List<Product> findAllProducts() {
		
		
		return productRepository.findAll();
	}

	public Product saveProducts(Product product) {
		
		return productRepository.save(product);
	}

	public Optional<Product> getProductById(Integer id) {
		
		return productRepository.findById(id);
	}

}
