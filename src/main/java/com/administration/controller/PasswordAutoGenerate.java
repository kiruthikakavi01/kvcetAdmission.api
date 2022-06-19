package com.administration.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.administration.dao.RegistrationRepository;

@RestController
public class PasswordAutoGenerate {
	@Autowired
	RegistrationRepository regrepository;
	
	

	public String autoUserGerate(String course) {
		
		try {

			String name = new String(getUserName());
			name = "kvcet"+course+name;
			
			
			return name;
		}catch(Exception e) {
			
			return null;
		}
		
	}
public String autoPassGerate() {
		
		try {

			
			String password = new String(generatePassword());
			
			return password;
		}catch(Exception e) {
			
			return null;
		}
		
	}

	private static char[] getUserName() {
		int len = 4;
		String numbers = "1234567890";
		 String combinedChars =  numbers;
		 Random random = new Random();
	      char[] name = new char[len];
	      name[0] = numbers.charAt(random.nextInt(numbers.length()));
	      name[1] = numbers.charAt(random.nextInt(numbers.length()));
	      name[2] = numbers.charAt(random.nextInt(numbers.length()));
	      name[3] = numbers.charAt(random.nextInt(numbers.length()));
	      for(int i = 4; i< len ; i++) {
		         name[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
		      return name;
	}

	private static char[] generatePassword() {
		int length = 10;
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }

}
