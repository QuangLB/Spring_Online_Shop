package com.spring.Service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.spring.Service.CartService;
import com.spring.dao.CartDAO;
import com.spring.model.CartDTO;

@SessionScope
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDAO cartDAO;

	private Map<Integer, CartDTO> map = new HashMap<>();

	@Override
	public void remove(Integer id) {
		map.remove(id);
	}

	public void clear() {
		map.clear();
	}

	@Override
	public Collection<CartDTO> getItems() {
		return map.values();
	}

	@Override
	public HashMap<Integer, CartDTO> AddCart(Integer id, HashMap<Integer, CartDTO> cart) {
		return cartDAO.AddCart(id, cart);
	}

	@Override
	public HashMap<Integer, CartDTO> EditCart(Integer id, int quanty, HashMap<Integer, CartDTO> cart) {
		return cartDAO.EditCart(id, quanty, cart);
	}

	@Override
	public HashMap<Integer, CartDTO> DeleteCart(Integer id, HashMap<Integer, CartDTO> cart) {
		return cartDAO.DeleteCart(id, cart);
	}

	@Override
	public int TotalQuanty(HashMap<Integer, CartDTO> cart) { 
		return cartDAO.TotalQuanty(cart);
	}

	@Override
	public int TotalPrice(HashMap<Integer, CartDTO> cart) {
		return cartDAO.TotalPrice(cart);
	}

}
