package com.ecom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.Category;
import com.ecom.api.repository.CategoryRepo;

@Service
public class CategoryService {
@Autowired
CategoryRepo categoryRepo;

public List<Category> findCategory() {
	return categoryRepo.findAll();
}

public Category saveCategory(Category category) {
	return categoryRepo.save(category);
}

}
