package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.AuthorizationBean;

//controller to return a success message
@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {
	
	@GetMapping(path = "/Auth")
	public AuthorizationBean basicauth() {
		return new AuthorizationBean("you are authorized");
	}
	
}
