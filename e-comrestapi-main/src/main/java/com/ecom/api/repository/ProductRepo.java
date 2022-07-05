package com.ecom.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.ecom.api.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
		@Query(value = "SELECT * FROM product where category='mobile'",nativeQuery = true)
		public List<Product> findBymobile(); 
		@Query(value = "SELECT * FROM product where category_subcat='laptop'",nativeQuery = true)
		public List<Product> findBylaptop(); 
		@Query(value = "SELECT * FROM product where category_subcat='ac'",nativeQuery = true)
		public List<Product> findByac(); 
		
	
		
		
}
