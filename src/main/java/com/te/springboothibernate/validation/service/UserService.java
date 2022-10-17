package com.te.springboothibernate.validation.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.springboothibernate.validation.entity.User;
import com.te.springboothibernate.validation.entity.UserDto;
import com.te.springboothibernate.validation.repository.UserRepository;

public interface UserService {

	public abstract UserDto saveUserDetails(UserDto userDto);

	public abstract UserDto findUserById(Integer userId);
}
