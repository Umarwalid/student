package com.stdapp.demo.dao;

import java.time.LocalDate;
import java.time.Month;
public class birthday {
	 
	 int  m;
	 int  d;
	 birthday(int a ,int b ){ 
		 m=b;
		 d=a;
	 }
	 public void bd() {	
	Month c=  Month.of(m);
    // get current date
    LocalDate currentDate = LocalDate.now();
    System.out.println("Todays Date: " + currentDate);

    // get current date and month
    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if(date == d && month == c) {
      System.out.println("HAPPY BIRTHDAY TO YOU !!");
    }
    else {
      System.out.println("Good day.");
    }
   
	}
	public  static void main(String[] args) {
		birthday a = new birthday(10,9);
		a.bd();
	}
	}

