package com.administration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.administration.dto.MessageDTO;
import com.administration.model.AdminRegistration;
import com.administration.service.AdminRegistrationService;







@RestController
public class AdminController {

	@Autowired
	AdminRegistrationService adminService;
	
	@PostMapping("admin/save")
	public ResponseEntity<String> insert(@RequestBody AdminRegistration registration) {
		try {
			adminService.save(registration);
		return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}	
	}
	@PostMapping("admin/login")
	public MessageDTO login(@RequestBody AdminRegistration registration) {
		MessageDTO message = new MessageDTO();
		try {
			adminService.login(registration);
			
			message.setMessage("admin");
				return message;
			
		} catch (Exception e) {
			message.setMessage(e.getMessage());
			return message;
		}
	}

	

}