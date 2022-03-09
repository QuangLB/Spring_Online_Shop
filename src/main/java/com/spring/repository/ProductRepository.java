package com.spring.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;
import com.spring.model.ProductDTO;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query
	Page<Product> findAllByAvailable(boolean available, Pageable pageable);
	
//	Optional<ProductDTO> FindProductByID(Integer id);
}
