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
@Table(name="registration_details")
public class AdmissionRegistration {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	
	@Column(name="Student_name")
	private String studentName;
	
	@Column(name="Contact_number")
	private Long contactNumber;
	
	@Column(name="Email_id")
	private String emailId;
	
	@Column(name="Course")
	private String course ;
	
	@Column(name="Username")
	private String userName;
	
	@Column(name="Password")
	private String password;
	
}
