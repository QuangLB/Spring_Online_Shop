package com.spring.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {
	private int id;

	@NotNull
	@NotBlank
	private String name;

	@NotNull
	private int price;

	@NotNull
	@NotBlank
	private String image;

	@NotNull
	private int Available;

	@NotNull
	private int CategoryID;

}
