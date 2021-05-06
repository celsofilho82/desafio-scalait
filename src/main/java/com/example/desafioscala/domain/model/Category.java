package com.example.desafioscala.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	private String name;

	@Enumerated(EnumType.STRING)
	private CategoryType type;

	public void setName(String name) {
		this.name = name;
	}

	public void setType(CategoryType type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public CategoryType getType() {
		return type;
	}

}
