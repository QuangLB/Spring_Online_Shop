package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Categories;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Integer> {

}
