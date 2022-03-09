package com.spring.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.model.UserDTO;

@Service
public class UserMapper {
	@Autowired
	private ModelMapper mapper;

	public User convertToEntity(UserDTO userDTO) {
		User entity = mapper.map(userDTO, User.class);
		return entity;
	}

	public UserDTO convertToDTO(User entity) {
		UserDTO UserDTO = mapper.map(entity, UserDTO.class);
		return UserDTO;
	}
}
