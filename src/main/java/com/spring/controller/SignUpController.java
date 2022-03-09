package com.spring.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.Service.SessionService;
import com.spring.Service.UserService;
import com.spring.entity.User;
import com.spring.model.UserDTO;
import com.spring.repository.UserRepository;

@Controller
public class SignUpController {

	@Autowired
	UserService ServiceU;

	@Autowired
	HttpServletRequest req;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	SessionService ss;

	@GetMapping("/signup")
	public String showForm() {
		return "auth/registration";
	}

	@PostMapping("/submit")
	public String save(Model model, RedirectAttributes params, @Valid @ModelAttribute("user") UserDTO DTO,
			BindingResult result) {
		if (result.hasErrors()) {
			params.addAttribute("messE", result.getAllErrors());
			return "redirect:/login";
		} else {
			User u = new User();
			Integer idU = (int) Math.random();
			DTO.setId(idU);
			DTO.setPhoto("123");
			BeanUtils.copyProperties(DTO, u);
			params.addAttribute("mess", u.getId());
			userRepo.save(u);
			return "redirect:/login";
		}
	}
}
