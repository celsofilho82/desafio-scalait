package com.example.desafioscala.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafioscala.domain.model.User;
import com.example.desafioscala.domain.respository.UserRepository;
import com.example.desafioscala.request.UserRequest;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserRepository repository;

	@PostMapping
	public ResponseEntity<User> create(@RequestBody @Valid UserRequest request) {
		User user = request.toModel();
		repository.save(user);

		return ResponseEntity.ok(user);
	}

}
