 package com.studentregister.demo.dao;
import java.time.*; // This is used to utilize dates/times
import java.util.Scanner; // This is used to obtain input
public class Studentage {
	
		public void check() {
		    System.out.println(" enter your date of birth in yyyy-mm-dd format");
		    Scanner sa = new Scanner(System.in); 

		    
		    String dob = sa.next(); 
		  
		   LocalDate dateOfBirth = LocalDate.parse(dob); 

		   
		   LocalDate currDate = LocalDate.now(); 

		 
		  Period period = Period.between(currDate, dateOfBirth); 

		 
		  int age  = Math.abs(period.getYears()); 
	        
	          System.out.println("Date of Birth: " + dob);
	          System.out.println("Today's Date: " + currDate); 
	          if(age>25) {
	          System.out.println("You are too old");
	          }
	           if (age<18)
				System.out.println("You are not old enough");
	         
		}
	
public static void main(String[] args) {
	Studentage c = new Studentage();
	
	c.check();
}
}
    