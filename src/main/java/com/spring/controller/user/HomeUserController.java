package com.spring.controller.user;

import java.util.List;
import java.util.Optional;

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

import com.spring.entity.Product;
import com.spring.entity.User;
import com.spring.model.UserDTO;
import com.spring.repository.ProductRepository;
import com.spring.repository.UserRepository;

@Controller
@RequestMapping(value = "/user")
public class HomeUserController {
	@Autowired
	private ProductRepository productRepo;

	@Autowired
	HttpSession session;

	@Autowired
	UserRepository userRepo;

	@GetMapping("/home")
	public String index(Model model) {

		if (session.getAttribute("name") != null) {
			List<Product> listProduct = this.productRepo.findAll();
			model.addAttribute("listProduct", listProduct);
			return "user/listProduct";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("/profile")
	public String showProfile(Model model) {

		if (session.getAttribute("name") != null) {

			return "user/editProfile";
		} else {
			return "redirect:/login";
		}
	}

	@PostMapping("/update")
	public String update(Model model, RedirectAttributes params, @Valid @ModelAttribute("user") UserDTO DTO,
			BindingResult result) {
		if (result.hasErrors()) {
			params.addAttribute("messE", result.getAllErrors());
			return "user/editProfile";
		} else {
			User u = new User();
			BeanUtils.copyProperties(DTO, u);
			params.addAttribute("mess", u.getId());
			userRepo.save(u);
			return "redirect:/user/profile";
		}
	}
}
