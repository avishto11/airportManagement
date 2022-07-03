package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AirportAdmin;
import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;

public interface UserService {

	List<User> GetUsers();
	String saveUser(User user);
	User getUserByUsername(String username);
	
	List<CompanyAdmin> GetCompanyAdmins();
	String saveCompanyAdmin(CompanyAdmin companyAdmin);
	CompanyAdmin getByCompanyAdminName(String username);
	
	List<AirportAdmin> GetAirportAdmins();
	AirportAdmin getByAirportAdminName(String username );
	String saveAirportAdmin(AirportAdmin aadmin);
	String deleteCompanyAdmin(String username);
		
}
