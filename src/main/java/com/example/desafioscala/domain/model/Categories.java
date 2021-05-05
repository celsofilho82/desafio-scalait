package com.example.desafioscala.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	private String name;

	@Enumerated(EnumType.STRING)
	@NotBlank
	private CategoryType type;

	public Categories(@NotBlank String name, @NotBlank CategoryType type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Deprecated
	public Categories() {
		super();
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
