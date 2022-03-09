package com.spring.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Service.ProductService;
import com.spring.entity.Product;
import com.spring.model.CartDTO;
import com.spring.model.ProductDTO;
import com.spring.repository.ProductRepository;

@Service
public class CartDAO extends BaseDAO {
	@Autowired
	private ProductRepository productRepository;

	public HashMap<Integer, CartDTO> AddCart(Integer id, HashMap<Integer, CartDTO> cart) {
		CartDTO itemCart = new CartDTO();
		Optional<Product> opt = productRepository.findById(id);
		Product product = opt.get();
		ProductDTO dto = new ProductDTO();
		BeanUtils.copyProperties(product, dto);
		if (dto != null) {
			itemCart.setProduct(dto);
			int price = dto.getPrice();
			itemCart.setTotalprice(price);
			itemCart.setQuanty(1);
		}
		cart.put(id, itemCart);
		return cart;
	}


	public HashMap<Integer, CartDTO> EditCart(Integer id, int quanty, HashMap<Integer, CartDTO> cart) {
		CartDTO itemCart = new CartDTO();
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			itemCart.setTotalprice(quanty * itemCart.getProduct().getPrice());

		}

		cart.put(id, itemCart);
		return cart;
	}


	public HashMap<Integer, CartDTO> DeleteCart(Integer id, HashMap<Integer, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	public int TotalQuanty(HashMap<Integer, CartDTO> cart) {
		int totalQuanty = 0;
		for (Entry<Integer, CartDTO> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}

	public int TotalPrice(HashMap<Integer, CartDTO> cart) {
		int totalPrice = 0;
		for (Entry<Integer, CartDTO> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalprice();
		}
		return totalPrice;
	}
	
	public int Name(HashMap<Integer, CartDTO> cart) {
		int totalPrice = 0;
		for (Entry<Integer, CartDTO> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalprice();
			
		}
		return totalPrice;
	}
}
