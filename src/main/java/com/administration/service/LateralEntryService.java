package com.administration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.dao.LateralDAO;
import com.administration.model.LateralEntry;



@Service
public class LateralEntryService {
	@Autowired
	LateralDAO lateralRepository;


	public void save(LateralEntry registration) throws Exception  {
		try {
			lateralRepository.save(registration);
		
		} catch (Exception e) {
			
			
			throw new Exception(e.getMessage());
		}
			
		
	}
}
