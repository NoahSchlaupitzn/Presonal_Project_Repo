package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.UserCredentials;
import com.repository.UserRepository;

//This is my controller class for userCredentials

@RequestMapping
@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	
	//Below a controller to get for users and return a status depending if there
	//or aren't any user credentials 
	@GetMapping
	public ResponseEntity<List<UserCredentials>> getUsers(){
		List<UserCredentials> userCred = (List<UserCredentials>) userRepository;
		if(userCred.size() == 0) {
			return new ResponseEntity<List<UserCredentials>>(userCred, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<UserCredentials>>(userCred, HttpStatus.OK);
		
	}
	
	

}
