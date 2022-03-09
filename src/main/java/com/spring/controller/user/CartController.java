package com.spring.controller.user;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Service.impl.CartServiceImpl;
import com.spring.entity.User;
import com.spring.model.CartDTO;

@Controller
public class CartController {
	@Autowired
	private CartServiceImpl cartService;

	@GetMapping("/cart")
	public String index(Model model, HttpSession session) {

		model.addAttribute("list1", null);

		return "admin/users/cart/listCart";

	}

	@RequestMapping("addCart/{id}")
	public String addCart(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDTO>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("price", cartService.TotalPrice(cart));
		session.setAttribute("quanty", cartService.TotalQuanty(cart));

		return "redirect:" + request.getHeader("Referer");
//		return "redirect:/cart";
	}

	@RequestMapping(value = "EditCart/{id}")
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable Integer id) {
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDTO>();
		}

		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable Integer id) {
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDTO>();
		}
		cart = cartService.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("quanty", cartService.TotalQuanty(cart));
		session.setAttribute("price", cartService.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
//		return "redirect:/cart";
	}
}
