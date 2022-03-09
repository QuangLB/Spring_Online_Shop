package com.spring.Service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Service.UserService;
import com.spring.entity.User;
import com.spring.repository.UserRepository;

@Service
public class UserServiceIImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public boolean checkLogin(String email, String password) {
		Optional<User> optionalUser = findByEmail(email);
		if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(password)) {
			return true;
		}
		return false;
	}
}
