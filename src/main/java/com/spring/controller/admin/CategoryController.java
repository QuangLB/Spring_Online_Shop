package com.spring.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.Categories;
import com.spring.repository.CategoryRepository;

@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

	private CategoryRepository cateRepo;

	@GetMapping("/list")
	public String index(Model model) {
		List<Categories> list = this.cateRepo.findAll();
		
			model.addAttribute("listCategory", list);

		return "admin/category/listCategory";
	}
}
