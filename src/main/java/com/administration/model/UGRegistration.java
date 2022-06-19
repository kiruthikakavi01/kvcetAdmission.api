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
@Table(name="ug_details")
public class UGRegistration {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Enquiry_No")
	private Integer enquiryNo;
	@Column(name="Date_of_Enquiry")
	private String dateOfEnquiry;
	@Column(name="Name_of_the_Candidate")
	private String name;
	@Column(name="Name_of_the_Programme")
	private String programme;
	@Column(name="Contact_Number")
	private long contactNumber;
	@Column(name="Email_id")
	private String emailId;
	@Column(name="School")
	private String school;
	@Column(name="Medium_of_Instruction")
	private String mediumOfInstruction;
	@Column(name="Place")
	private String place;
	@Column(name="Maths_mark ")
	private String mathsMark;
	@Column(name="Physics_mark")
	private String physicsMark;
	@Column(name="Chemistry_mark")
	private String chemistryMark;
	@Column(name="Total_Hsc_Score")
	private int TotalHscScore;
	@Column(name="Cut_off")
	private double cutOff;
	@Column(name="Group_Hsc")
	private String groupHsc;
	@Column(name="Community")
	private String community;
	@Column(name="Date_of_Birth")
	private String dateOfBirth;
	@Column(name="Scholarship_Applicable")
	private String scholarshipApplicable;
	@Column(name="Father_Name")
	private String fatherName;
	@Column(name="Father_Occupation")
	private String fatherOccupation;
	@Column(name="Mother_Name")
	private String motherName;
	@Column(name="Mother_Occupation")
	private String motherOccupation;
	@Column(name="Parent_Contact_Number")
	private long parentContactNumber;
	@Column(name="Alternative_Number")
	private long alternativeNumber;
	@Column(name="Address")
	private String address;
	@Column(name="How_to_know_KVCET")
	private String howToKnowkvcet;
	@Column(name="Name_of_the_reference")
	private String nameOfTheReference;
	@Column(name="IF_candidate")
	private String ifCandidate;
	@Column(name="Amount_paid")
	private Integer amountPaid;
	@Column(name="Original_Certificate_list")
	private String originalCertificateList;
	
	
	
}
