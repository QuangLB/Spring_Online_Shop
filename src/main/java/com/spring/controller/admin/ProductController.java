package com.spring.controller.admin;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.entity.User;
import com.spring.entity.Product;
import com.spring.model.ProductDTO;
import com.spring.model.UserDTO;
import com.spring.repository.ProductRepository;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
	@Autowired
	private ProductRepository productRepo;

	@Autowired
	HttpSession session;
	
	@Autowired
	private HttpServletRequest request;

	@GetMapping()
	public String index(Model model) {

		if (session.getAttribute("name") != null) {
			List<Product> listProduct = this.productRepo.findAll();

			model.addAttribute("listProduct", listProduct);

			return "admin/product/index";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("/create")
	public String create(Model model) {
		if (session.getAttribute("name") != null) {
			model.addAttribute("product", new Product());
			return "admin/product/create";
		} else {
			return "redirect:/login";
		}

	}

	@GetMapping(value = "/edit/{id}")
	public String edit(Model model, @PathVariable("id") Integer id) {
		if (session.getAttribute("name") != null) {
			Optional<Product> opt = productRepo.findById(id);
			ProductDTO p = new ProductDTO();
			if (opt.isPresent()) {
				Product product = opt.get();
				BeanUtils.copyProperties(product, p);
			}
			model.addAttribute("product", p);
			return "admin/product/edit";
		} else {
			return "redirect:/login";
		}

	}

	@PostMapping("/save")
	public String save(Model model, RedirectAttributes params, @Valid @ModelAttribute("product") ProductDTO DTO,
			BindingResult result) {
		if (result.hasErrors()) {
			params.addAttribute("messE", result.getAllErrors());
			return "admin/product";
		} else {
			Product p = new Product();
			BeanUtils.copyProperties(DTO, p);
			params.addAttribute("mess", p.getId());
			productRepo.save(p);
			return "redirect:/admin/product";
		}
	}

	@PostMapping("/update")
	public String update(Model model, RedirectAttributes params, @Valid @ModelAttribute("product") ProductDTO DTO,
			BindingResult result) {
		if (result.hasErrors()) {
			params.addAttribute("messE", result.getAllErrors());
			return "admin/product";
		} else {
			Product p = new Product();
			BeanUtils.copyProperties(DTO, p);
			params.addAttribute("mess", p.getId());
			productRepo.save(p);
			return "redirect:/admin/product";
		}
	}

	
	@GetMapping("/delete/{id}")
	public String delete(RedirectAttributes params, @PathVariable("id") Integer id) {
//		params.addAttribute("mess", id);
//		userRepo.deleteById(id);
		return "redirect:" + request.getHeader("Referer");

	}

}
