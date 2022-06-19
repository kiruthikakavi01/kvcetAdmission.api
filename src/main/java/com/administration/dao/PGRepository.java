package com.administration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.administration.model.PGAdministration;
@Repository
public interface PGRepository extends JpaRepository<PGAdministration, Integer> {

}
