package com.administration.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.administration.model.AdmissionRegistration;




@Repository
public interface RegistrationRepository extends JpaRepository<AdmissionRegistration, Integer> {
//	Optional<AdmissionRegistration> findByEmailAndPassword(String userName, String password);
	
	@Query("SELECT u.course FROM AdmissionRegistration u WHERE u.userName = ?1 and u.password=?2")
	public String findByUsernameAndPassword(String userName,String password);
	
	
	
}
