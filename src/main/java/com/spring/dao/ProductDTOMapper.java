package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.ProductDTO;

public class ProductDTOMapper implements RowMapper<ProductDTO>{

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDTO product = new ProductDTO();
		product.setId(rs.getInt("id_product"));
		product.setName(rs.getString("name_product"));
		product.setImage(rs.getString("price_product"));
		product.setPrice(rs.getInt("id_product"));
		product.setAvailable(rs.getInt("available_product"));
		product.setCategoryID(rs.getInt("categoryID_product"));
		return product;
	}

}
