package com.administration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.administration.dto.MessageDTO;
import com.administration.model.PGAdministration;

import com.administration.service.PGService;

@RestController
public class PGContoller {

	@Autowired
	PGService pgService;

	@PostMapping("pg/save")
	public ResponseEntity<?> insert(@RequestBody PGAdministration pgAdministration) {

		try {
			pgService.save(pgAdministration);
			MessageDTO message = new MessageDTO();
			message.setMessage("success");
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			MessageDTO message = new MessageDTO();
			message.setMessage(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("pg/list")
	public List<PGAdministration> listPgAdmission() {
		List<PGAdministration> findAll = null;
		try {
			findAll = pgService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}

}
