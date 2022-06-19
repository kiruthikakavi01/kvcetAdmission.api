package com.administration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.dao.PGRepository;
import com.administration.model.PGAdministration;


@Service
public class PGService {
	@Autowired
	PGRepository pgRepository;

	public void save(PGAdministration pgAdministration) throws Exception {
		try {

			pgRepository.save(pgAdministration);
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}
	public List<PGAdministration> findAll() throws Exception{
		List<PGAdministration> listPgAdmission=null;
		try {
			listPgAdmission=pgRepository.findAll();	
		}catch(Exception e) {
				throw new Exception(e.getMessage());
		}
		return listPgAdmission;
	}
}
