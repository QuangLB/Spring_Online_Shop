package com.spring.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.entity.User;


@Service
public interface UserService {

	
	Optional<User> findByEmail(String email);

	
	boolean checkLogin(String email, String password);

}
