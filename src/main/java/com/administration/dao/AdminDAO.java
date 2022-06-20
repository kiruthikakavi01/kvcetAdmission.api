package com.administration.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.administration.model.AdminRegistration;



@Repository
public interface AdminDAO  extends JpaRepository<AdminRegistration,Integer>{
	Optional<AdminRegistration> findByEmailAndPassword(String email, String password);
}
