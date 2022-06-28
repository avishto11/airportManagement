package com.example.demo.controller;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CompanyAdmin;
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
	
	
	@GetMapping("/getUser/{username}")
	public User getUserByUsername(@PathVariable("username")String username) {
		System.out.println("Username::=========================="+username);
		return userService.getUserByUsername(username);
	}
	
	@PostMapping("/enterUsers")
	public String entterUsers(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok().body(userService.GetUsers());
	}
	
	@PostMapping("/enterCompanyAdmin")
	public CompanyAdmin entterUsers(@RequestBody CompanyAdmin admin) {
		return userService.saveCompanyAdmin(admin);
	}
	
}
