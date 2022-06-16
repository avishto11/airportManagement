package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	@GetMapping("/test")
	public String apiTest() {
		System.out.println("In test api");
		return "connected";
	}
	
	@PostMapping("/enterUsers")
	public User entterUsers(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
