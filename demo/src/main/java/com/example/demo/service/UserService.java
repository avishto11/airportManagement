package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;

public interface UserService {

	User saveUser(User user);
	List<User> GetUsers();
	
	CompanyAdmin saveCompanyAdmin(CompanyAdmin admin);
	
		
	
}
