package com.example.Spring_Validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Spring_Validation.entity.RequestUser;
import com.example.Spring_Validation.entity.User;
import com.example.Spring_Validation.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public ResponseEntity<User> addUser(RequestUser user){
		
		User u=User.build(0, user.getName(), user.getEmail(), user.getPhoneNumber(), user.getAge(), user.getGender(), user.getNationality());
		repo.save(u);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
}
