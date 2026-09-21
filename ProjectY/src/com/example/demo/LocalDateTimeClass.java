package com.example.demo;

import java.time.LocalDateTime;

public class LocalDateTimeClass {
 public static void main(String[] Args) {
	 System.out.println("Md Shahajada Imran");
	 
	 LocalDateTime dt=LocalDateTime.now(); //Static factory method calls. the now() method returns an object which is stored in dt variable. 
	 System.out.println(dt);
	 String st=dt.toString(); //Converting object to String
	 String[] a=st.split("T"); //dividing the string by T and converting into an array
	 String[] b=a[0].split("-"); //dividing the array element by "-" and converting into an array 
	 
	 String vYear=b[0]; //Assigning 1st Array Element value into a variable
	 String vMonth=b[1]; //Assigning 2nd Array element value into a variable
	 String vDay=b[2]; //Assigning 3rd array element value into a variable
	 
	 int iYear=Integer.parseInt(vYear); //Converting String to int type
	 int iMonth=Integer.parseInt(vMonth); //Converting String to int type
	 int iDay=Integer.parseInt(vDay); //Converting String to int type
	 
	 System.out.println("Todays System date is "+ iDay);
	 System.out.println("Todays System month is "+iMonth);
	 System.out.println("Todays System Year is "+iYear);
 }
}
