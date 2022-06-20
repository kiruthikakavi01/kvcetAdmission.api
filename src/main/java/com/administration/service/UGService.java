package com.administration.service;

import java.util.List;

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
	public List<UGRegistration> findAll() throws Exception{
		List<UGRegistration> listUgAdmission=null;
		try {
			listUgAdmission=ugRepository.findAll();	
		}catch(Exception e) {
				throw new Exception(e.getMessage());
		}
		return listUgAdmission;
	}
}
