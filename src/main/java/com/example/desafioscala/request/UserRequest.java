package com.example.desafioscala.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.example.desafioscala.domain.model.User;

public class UserRequest {

	@NotBlank
	private String name;

	@NotBlank
	@Email
	private String email;

	public UserRequest(@NotBlank String name, @NotBlank @Email String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public User toModel() {
		return new User(this.name, this.email);
	}

}
