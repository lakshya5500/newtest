package com.ecom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.api.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, String>{

}
