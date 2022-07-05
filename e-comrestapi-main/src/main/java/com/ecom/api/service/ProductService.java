package com.ecom.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.Product;
import com.ecom.api.exception.ProductNotExistException;
import com.ecom.api.repository.ProductRepo;

@Service
public class ProductService {
@Autowired
ProductRepo productRepo;

public List<Product> findProducts() {
	return productRepo.findAll();
}

public Product saveProduct(Product product) {
	return productRepo.save(product);
}

public Optional<Product> getProductbyid(Integer pid) throws ProductNotExistException {
	Optional<Product> prod = productRepo.findById(pid);

	if (!prod.isPresent()) {
		throw new ProductNotExistException("Product Not Exist :  " + pid );
		
	} else {
		return prod;
	}

}

public String deleteProduct(Integer pid) throws ProductNotExistException {
	if (!productRepo.existsById(pid))
		throw new ProductNotExistException("Product Not Found : " + pid);
	productRepo.deleteById(pid);
	return "Product Deleted";
}

public Product updateProduct(Integer pid , Product product) {
if (!productRepo.existsById(pid))
	throw new ProductNotExistException("Product Not Found : " + pid);


	return productRepo.save(product);
}

}
