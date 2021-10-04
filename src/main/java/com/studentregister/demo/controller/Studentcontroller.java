package com.studentregister.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.studentregister.demo.dao.Studentdrepo;
import com.studentregister.demo.model.StudentRecord;

@RestController
public class Studentcontroller {

	@Autowired
	Studentdrepo repo;
		
	@PostMapping ("/addstudent")
	public StudentRecord addstudent(StudentRecord s) {
		repo.save(s);
		
		return s;
	
	} 
	
	@RequestMapping ("/removestudent/{id}")
	public StudentRecord removestudent(StudentRecord s) {
		repo.delete(s);
		
		return s;
	
	} 
	@RequestMapping ("/updatestudent/{id}")
	public StudentRecord updatestudent(StudentRecord s) {
		repo.save(s);
		
		return s;
	
	} 
	@RequestMapping ("/student/{id}")
	public Optional<StudentRecord> student(@PathVariable("id") int s) {
		return repo.findById(s);
		
	
	
	} 
	
}