package com.administration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="admin_registration")
public class AdminRegistration {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	@Column(name="Email_Id")
	private String email;
	@Column(name="Admin_Name")
	private String adminName;
	@Column(name="Phone_Number")
	private long phoneNumber;
	@Column(name="Admin_Password")
	private String password;
	@Column(name="Role_Admin")
	private String roleAdmin;
	
	
	
}