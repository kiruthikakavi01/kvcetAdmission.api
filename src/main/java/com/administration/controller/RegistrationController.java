package com.administration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.administration.dto.MessageDTO;
import com.administration.model.AdmissionRegistration;
import com.administration.service.EmailSenderService;
import com.administration.service.RegService;
import com.administration.service.SpringEmailClientApplication;

@RestController
public class RegistrationController {

		@Autowired
		RegService regService;
		@Autowired	
		SpringEmailClientApplication service;
		@Autowired
		EmailSenderService res;
		@Autowired
		PasswordAutoGenerate userpass;
		@PostMapping("reg/save")
		public ResponseEntity<String> insert(@RequestBody AdmissionRegistration reg) {
			try {
				System.out.println(reg.getStudentName()+reg.getEmailId()+reg.getCourse()+reg.getContactNumber());
				String username=userpass.autoUserGerate(reg.getCourse());
				String password=userpass.autoPassGerate();
				//String username="UserName: "+reg.getUserName();		
			    String emailId=reg.getEmailId();
				//String password="Password: "+reg.getPassword();
			    System.out.println(username+password);
			    reg.setUserName(username);
			    reg.setPassword(password);
				System.out.println(reg);
				regService.save(reg);
				String link="http://localhost:4200/login";
				
				String body="Hai "+reg.getStudentName()+", thanks for Registering.Your "+"UserName: "+username+"  Password: "+password+"  Fill the form by using below link: "+link;
				res.sendSimpleEmail(emailId,body,"Confirmation Mail");
				//service.triggerMail();
						
				
			return new ResponseEntity<String>(HttpStatus.OK);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
			}
			
	}

	
		@PostMapping("reg/login")
		public MessageDTO login(@RequestBody AdmissionRegistration reg) {
			MessageDTO message = new MessageDTO();
			
			try {
				String res = regService.login(reg);
				
				message.setMessage(res);
					return message;
				
			} catch (Exception e) {
				message.setMessage(e.getMessage());
				return message;
			}
		}	

}
