//package com.spring.Service.impl;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.spring.Service.ProductService;
//import com.spring.entity.Product;
//import com.spring.model.ProductDTO;
//import com.spring.repository.ProductRepository;
//
//public class ProductServiceImpl implements ProductService{
//	@Autowired
//	private ProductRepository productRepository;
//	
//	@Override
//	public Optional<ProductDTO> FindProductByID(Integer id) {
//		return productRepository.FindProductByID(id);
//	}
//
//}
