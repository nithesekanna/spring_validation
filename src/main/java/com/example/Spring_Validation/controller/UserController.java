package com.example.Spring_Validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Validation.entity.RequestUser;
import com.example.Spring_Validation.entity.User;
import com.example.Spring_Validation.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/control")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody @Valid RequestUser user){
		return service.addUser(user);
	}
}
