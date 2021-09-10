package com.stdapp.demo.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



@Entity
public class std {
	
	@Id
    @Column(name = "matrixno")
	@SequenceGenerator(name = "flexsaf")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FLEXISAF")
	private long id;
	
	//@GeneratedValue(generator = "FLEXISAF/")
	//   @GenericGenerator(
	//	        name = "FLEXISAF/", 
	//	        strategy = "com.javanibble.springdata.examples.identifier.generator.StaffIdentifierGenerator"
	//	    )
	//	    private Long id;


	
	private String firstname;
	private String lastname;
	private String othername;
	
	private String gender;
	private Date dob;
	private String department;
	private String creator;
	private LocalDateTime  made = LocalDateTime.now();  
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getOthername() {
		return othername;
	}
	public void setOthername(String othername) {
		this.othername = othername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public LocalDateTime getMade() {
		return made;
	}
	public void setMade(LocalDateTime made) {
		this.made = made;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	
	

}

