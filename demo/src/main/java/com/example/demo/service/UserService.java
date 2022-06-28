package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;

public interface UserService {

	String saveUser(User user);
	List<User> GetUsers();
	User getUserByUsername(String username);
	CompanyAdmin saveCompanyAdmin(CompanyAdmin admin);
	
		
	
}
