package com.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.administration.model.UGRegistration;
import com.administration.service.UGService;



@RestController
public class UGContoller {
	
	@Autowired
	UGService ugService;
	@PostMapping("ug/save")
	public ResponseEntity<String> insert(@RequestBody UGRegistration registration) {
		try {
		ugService.save(registration);
		return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}	
	}
	@GetMapping("ug/list")
	public List<UGRegistration> listUgAdmission() {
		List<UGRegistration> findAll = null;
		try {
			findAll =ugService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}
}
	
