package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;

public interface UserService {

	String saveUser(User user);
	List<User> GetUsers();
	List<CompanyAdmin> GetCompanyAdmins();
	User getUserByUsername(String username);
	
	String saveCompanyAdmin(CompanyAdmin companyAdmin);
	
	CompanyAdmin getByCompanyAdminName(String username);
		
}
