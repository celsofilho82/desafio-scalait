package com.example.desafioscala.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafioscala.domain.model.Category;
import com.example.desafioscala.domain.respository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@PostMapping
	public ResponseEntity<Category> create(@RequestBody @Valid Category request){
		Category category = new Category();
		category.setName(request.getName());
		category.setType(request.getType());
		
		categoryRepository.save(category);
		
		return ResponseEntity.ok(category);
	}
	
}
