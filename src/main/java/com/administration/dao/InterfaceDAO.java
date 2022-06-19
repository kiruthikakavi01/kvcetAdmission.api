package com.administration.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.administration.model.UGRegistration;



@Repository
public interface InterfaceDAO extends JpaRepository<UGRegistration,Integer>{

}
