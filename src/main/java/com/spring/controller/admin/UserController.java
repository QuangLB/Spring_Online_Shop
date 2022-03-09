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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.Service.UserService;
import com.spring.entity.User;
import com.spring.mapper.UserMapper;
import com.spring.model.UserDTO;
import com.spring.repository.UserRepository;

@Controller
@RequestMapping(value = "/admin/users")
public class UserController {
	@Autowired
	private HttpServletRequest request;

//	@Autowired
//	UserService userService;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private UserMapper mapper;

	@GetMapping("/index")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("name") != null) {
			List<User> listUser = this.userRepo.findAll();

			model.addAttribute("listUser", listUser);

			return "admin/users/index";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("create")
	public String create(Model model, HttpSession session) {
		if (session.getAttribute("name")  != null) {
			
			model.addAttribute("user", new User());
			return "admin/users/create";
			
		}else {
			return "redirect:/login";
		}
		
	}

	@GetMapping(value = "edit/{id}")
	public String edit(Model model, @PathVariable("id") Integer id, HttpSession session) {
		if (session.getAttribute("name")  != null) {
			Optional<User> opt = userRepo.findById(id);
			UserDTO u = new UserDTO();
			if (opt.isPresent()) {
				User user = opt.get();
				BeanUtils.copyProperties(user, u);
			}
			model.addAttribute("user", u);
			return "admin/users/edit";
		}else {
			return "redirect:/login";
		}
	}

	@PostMapping("/update")
	public String update(Model model, RedirectAttributes params, @Valid @ModelAttribute("user") UserDTO DTO,
			BindingResult result) {
		if (result.hasErrors()) {
			params.addAttribute("messE", result.getAllErrors());
			return "admin/users/index";
		} else {
			User u = new User();
			BeanUtils.copyProperties(DTO, u);
			params.addAttribute("mess", u.getId());
			userRepo.save(u);
			return "redirect:/admin/users/index";
		}
	}

	@PostMapping("/save")
	public String save(Model model, RedirectAttributes params, @Valid @ModelAttribute("user") UserDTO DTO,
			BindingResult result) {
		if (result.hasErrors()) {
			params.addAttribute("messE", result.getAllErrors());
			return "admin/users/index";
		} else {
			User u = new User();
			BeanUtils.copyProperties(DTO, u);
			params.addAttribute("mess", u.getId());
			userRepo.save(u);
			return "redirect:/admin/users/index";
		}
	}

	@GetMapping("/delete/{id}")
	public String delete(RedirectAttributes params, @PathVariable("id") Integer id) {
//		params.addAttribute("mess", id);
//		userRepo.deleteById(id);
		return "redirect:/admin/users/index";

	}

}
