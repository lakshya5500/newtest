package com.ecom.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Product;
import com.ecom.api.service.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class ProductRestController {

	@Autowired
	ProductService productService;
	
	@GetMapping("product")
	public List<Product> getProducts() {
		return productService.findProducts();
	}

	@PostMapping("/product")
	public Product saveProducts(@RequestBody  Product product) {
		return productService.saveProduct(product);
	}

	@GetMapping("product/{pid}")
	Optional<Product> getProductByid(@PathVariable("pid") Integer pid) {
		return productService.getProductbyid(pid);
	}

	@DeleteMapping("product/{pid}")
	public String deleteProductById(@PathVariable("pid") Integer pid) {
		return productService.deleteProduct(pid);  
	}

	@PutMapping("product/{pid}")
	public Product updateProductById( @PathVariable("pid") Integer pid, @RequestBody Product prod) {
	return productService.updateProduct(pid, prod);
	}
}
