package com.administration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.administration.model.LateralEntry;

public interface LateralDAO extends JpaRepository<LateralEntry, Integer> {

}
