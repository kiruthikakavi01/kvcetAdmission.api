package com.administration.service;

import java.util.List;

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
	public List<LateralEntry> findAll() throws Exception{
		List<LateralEntry> listPgAdmission=null;
		try {
			listPgAdmission=lateralRepository.findAll();	
		}catch(Exception e) {
				throw new Exception(e.getMessage());
		}
		return listPgAdmission;
	}
}
