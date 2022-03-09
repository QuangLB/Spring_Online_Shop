package com.spring.Service;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.spring.model.CartDTO;

@Service
public interface CartService {

	void remove(Integer id);

	Collection<CartDTO> getItems();

	void clear();

	public HashMap<Integer, CartDTO> AddCart(Integer id, HashMap<Integer, CartDTO> cart);

	public HashMap<Integer, CartDTO> EditCart(Integer id, int quanty, HashMap<Integer, CartDTO> cart);

	public HashMap<Integer, CartDTO> DeleteCart(Integer id, HashMap<Integer, CartDTO> cart);

	public int TotalQuanty(HashMap<Integer, CartDTO> cart);

	public int TotalPrice(HashMap<Integer, CartDTO> cart);

}
