package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "companyadmin")
public class CompanyAdmin {
	
			  @Id
			  private int id;
			  private String username; 
			  private String password;
			  private String companyAddress;
			  private String mobile;
			  private String name;
			  private String companyName;

			  
			  public CompanyAdmin(int id, String username, String password, String companyAddress, String mobile,
					String name, String companyName) {
				super();
				this.id = id;
				this.username = username;
				this.password = password;
				this.companyAddress = companyAddress;
				this.mobile = mobile;
				this.name = name;
				this.companyName = companyName;
			}


			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getUsername() {
				return username;
			}


			public void setUsername(String username) {
				this.username = username;
			}


			public String getPassword() {
				return password;
			}


			public void setPassword(String password) {
				this.password = password;
			}


			public String getCompanyAddress() {
				return companyAddress;
			}


			public void setCompanyAddress(String companyAddress) {
				this.companyAddress = companyAddress;
			}


			public String getMobile() {
				return mobile;
			}


			public void setMobile(String mobile) {
				this.mobile = mobile;
			}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}


			public String getCompanyName() {
				return companyName;
			}


			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}


			public CompanyAdmin() {
				  
			  }
			  
}
