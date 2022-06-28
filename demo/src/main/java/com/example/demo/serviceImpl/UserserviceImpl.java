package com.example.demo.serviceImpl;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;
import com.example.demo.repo.CompanyAdminrepo;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

@Service
@Transactional
public class UserserviceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CompanyAdminrepo companyAdminRepo;
	
	@Override
	public String saveUser(User user) {
		// TODO Auto-generated method stub
		User userCheck = null;
		userCheck = userRepo.getByUsername(user.getUsername());
		if(userCheck != null) {
			return "User ALready Exists";
		}else {
		 userRepo.save(user);
		}
		return "User addition Successfull";
	}

	@Override
	public List<User> GetUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public String saveCompanyAdmin(CompanyAdmin admin) {
		// TODO Auto-generated method stub
		CompanyAdmin adminCheck = null;
		adminCheck = companyAdminRepo.getByUsername(admin.getUsername());
		if(adminCheck != null) {
			return "User ALready Exists";
		}else {
			companyAdminRepo.save(admin);
		}
		return "User addition Successfull";
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepo.getByUsername(username);
	}

	@Override
	public CompanyAdmin getByCompanyAdminName(String username) {
		// TODO Auto-generated method stub
		return companyAdminRepo.getByUsername(username);
	}

	@Override
	public List<CompanyAdmin> GetCompanyAdmins() {
		// TODO Auto-generated method stub
		return companyAdminRepo.findAll();
	}

}
