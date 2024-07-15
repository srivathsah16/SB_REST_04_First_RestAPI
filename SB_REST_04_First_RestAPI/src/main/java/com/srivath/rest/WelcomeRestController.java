package com.srivath.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivath.databind.User;

@RestController
public class WelcomeRestController {

	public WelcomeRestController() {
		System.out.println("WelcomeRestController constructor triggered...");
	}

	Map<Integer, User> userData = new HashMap<>();

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("request came to welcome method");
		return "Welcome to REST APIs..";
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		System.out.println("request came to greet method");
		String responseBody = "Good Morning";
		return new ResponseEntity<String>(responseBody, HttpStatus.OK);
	}

	@PostMapping("/demo")
	public String demoPost() {
		System.out.println("request came to demoPost method");
		return "post req success";
	}

	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		System.out.println("request came to saveUser method");
		// logic to save user into database
		System.out.println(user);
		userData.put(user.getId(), user);
		return new ResponseEntity<String>("user saved successfully", HttpStatus.CREATED);
	}

}
