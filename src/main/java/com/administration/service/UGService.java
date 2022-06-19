package com.administration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.dao.InterfaceDAO;
import com.administration.model.UGRegistration;




@Service
public class UGService {
	@Autowired
	InterfaceDAO ugRepository;

	
	public void save(UGRegistration registration) throws Exception  {
		try {
			
			ugRepository.save(registration);
		} catch (Exception e) {
			
			
			throw new Exception(e.getMessage());
		}
			
		
	}
}
