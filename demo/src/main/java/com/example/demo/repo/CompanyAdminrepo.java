package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CompanyAdmin;
import com.example.demo.model.User;

public interface CompanyAdminrepo extends JpaRepository<CompanyAdmin, Long>  {
	
	public CompanyAdmin getByUsername(String companyAdmin);
	
	public void deleteByUsername(String username);

}
