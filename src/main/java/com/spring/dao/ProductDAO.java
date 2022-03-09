//package com.spring.dao;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.spring.model.ProductDTO;
//import com.spring.repository.ProductRepository;
//import com.spring.dao.ProductDTOMapper;
//import com.spring.entity.Product;
//@Repository
//public class ProductDAO extends BaseDAO{
//	@Autowired
//	private ProductRepository Repo;
//	public ProductDTO FindProductByID(Integer ID) {
//		Optional<Product> sql = Repo.findById(ID);
//		ProductDto product = _JdbcTemplate.queryForObject(sql, new ProductDTOMapper() );
//		return product;
//	}
//}
