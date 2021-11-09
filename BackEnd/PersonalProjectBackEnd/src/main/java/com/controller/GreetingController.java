package com.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Greeting;

/*
 * this is a greeting controller to greet the user
 * 
 * it will display the Hello (name), but if know name exist it defaults to world
 */


@RestController
public class GreetingController {

	private static final String template = "HELLO %s!";
	private final AtomicLong counter = new AtomicLong();
	
	// "/greeting" ensures correct mapping for http requests
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", 
	defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
