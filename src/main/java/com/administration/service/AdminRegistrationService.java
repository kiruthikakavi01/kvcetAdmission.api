package com.administration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.dao.AdminDAO;
import com.administration.model.AdminRegistration;



 

@Service
public class AdminRegistrationService {
	@Autowired
	AdminDAO adminRepository;

	public void save(AdminRegistration registration) throws Exception  {
		try {
			adminRepository.save(registration);
		
		} catch (Exception e) {
			
			
			throw new Exception(e.getMessage());
		}
	}
	public String  login(AdminRegistration registration) throws Exception {
		try {
			
			Optional<AdminRegistration> adminObj = adminRepository.findByEmailAndPassword(registration.getEmailId(),registration.getAdminPassword());
			System.out.println(adminObj);
			if (adminObj.isPresent()) {
				return "success";
			} else {
				return null;
			}

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}	

}