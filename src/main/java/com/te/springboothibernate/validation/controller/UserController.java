package com.te.springboothibernate.validation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboothibernate.validation.entity.UserDto;
import com.te.springboothibernate.validation.responce.GeneralResponce;
import com.te.springboothibernate.validation.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<GeneralResponce> saveUserData(@RequestBody @Valid UserDto userDto) {
		UserDto saveUserDetails = userService.saveUserDetails(userDto);
		return ResponseEntity.ok().body(new GeneralResponce("user data save", null, saveUserDetails));
	}

	@GetMapping("/user1/{userId}")
	public ResponseEntity<GeneralResponce> findUserById(@PathVariable("userId")Integer userId) {
		UserDto findUserById = userService.findUserById(userId);
		if (findUserById != null) {
			return ResponseEntity.ok().body(new GeneralResponce("get user data", null, findUserById));
		}
		return ResponseEntity.badRequest().body(new GeneralResponce("user data not getting", null, null));

	}
}
