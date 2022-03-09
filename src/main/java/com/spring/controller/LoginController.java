package com.spring.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.Service.SessionService;
import com.spring.Service.UserService;
import com.spring.entity.User;
import com.spring.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	UserService ServiceU;

	@Autowired
	HttpServletRequest req;

	@Autowired
	UserRepository repoU;

	@Autowired
	SessionService ss;

	@GetMapping("/login")
	public String showLoginForm() {
		return "auth/login";
	}

	@PostMapping("/checkLogin")
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model, HttpSession session) {
		if (ServiceU.checkLogin(email, password)) {
			Optional<User> opt = ServiceU.findByEmail(email);

			User user = opt.get();
			ss.set("user", user);
			ss.set("name", user.getFullname());
			ss.set("email", user.getEmail());
			System.out.println(user.getRole());
			model.addAttribute("fullnameUser", user.getFullname());
//			return "redirect:/admin/users/index";
			
			if (user.getRole() == 1) {
				return "redirect:/admin/users/index";
			} else {
				return "redirect:/user/home";
			}

		} else {
			return "auth/login";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("name");
		return "redirect:/login";
	}

}
