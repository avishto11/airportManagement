package com.example.demo.serviceImpl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

@Service
@Transactional
public class UserserviceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

}
