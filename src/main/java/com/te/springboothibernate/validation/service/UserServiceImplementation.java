package com.te.springboothibernate.validation.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboothibernate.validation.entity.User;
import com.te.springboothibernate.validation.entity.UserDto;
import com.te.springboothibernate.validation.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto saveUserDetails(UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		User saveUser = userRepository.save(user);
		BeanUtils.copyProperties(saveUser, userDto);
		return userDto;
	}

	@Override
	public UserDto findUserById(Integer userId) {
		Optional<User> optional = userRepository.findById(userId);
		if (optional.isPresent()) {
			User user = optional.get();
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(user, userDto);
			return userDto;
		}
		return null;
	}

}
