package com.administration.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.dao.RegistrationRepository;
import com.administration.model.AdmissionRegistration;


@Service
public class RegService {

	@Autowired
	RegistrationRepository regRepository;

	public void save(AdmissionRegistration reg) throws Exception {
		try {
            
			regRepository.save(reg);
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}
	public String  login(AdmissionRegistration reg) throws Exception {
		try {
			
			String userObj = regRepository.findByUsernameAndPassword(reg.getUserName(),reg.getPassword());
			System.out.println(userObj);
			String res=userObj;
			if (!userObj.isEmpty()){
				return res;
			} else {
				return null;
			}

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
