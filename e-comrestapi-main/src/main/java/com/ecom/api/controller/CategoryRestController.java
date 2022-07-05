package com.ecom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Category;
import com.ecom.api.service.CategoryService;

@RestController
@CrossOrigin(origins = "*")
public class CategoryRestController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("category")
	public List<Category> getCategories() {
		return categoryService.findCategory();
	}

	@PostMapping("/category")
	public Category saveCategories(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}
}
