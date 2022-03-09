package com.spring.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull
	private int quanty;
	@NotNull
	private Integer totalprice;
	@NotNull
	@NotBlank
	private ProductDTO product;

}
