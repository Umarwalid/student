package com.stdapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stdapp.demo.dao.stdrepo;
import com.stdapp.demo.model.std;

@Controller
public class stdcontroller {

	@Autowired
	stdrepo repo;
	
	@RequestMapping("/")
	public String home() {
	return "home.jsp";
	}
	
	
	@RequestMapping ("/addstd")
	public String addcars(std s) {
		repo.save(s);
		
		return "home.jsp";
	
	} 

}
