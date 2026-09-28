package com.example.demo;


import java.util.Arrays;
import java.util.List;

public class MyClass {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");	
		
		Calculator cal= (a,b) ->(a+b)*3; //Assigning a lambda expression into a variable of type Functional Interface. 
		int c=cal.add(5, 7); //using the add abstract method which was assigned using lambda expression
		System.out.println(c); //Printing c variables value. 
		
		MyPrint myprint=()->System.out.println("The Value is "+c);
		myprint.myPrint();	
		
		for(int i=0;i<3;i++) {
			myprint=()->System.out.print("my name is imran");			
			myprint.myPrint();
			System.out.print(" "+i+"\n");
			}
		
		List<String> names=Arrays.asList("Md","Shahajada","Imran");
		
		names.stream().forEach(e->System.out.println(e)); //printing each value using lambda expression and stream() method.
		
		for (String v: names) {
			System.out.println(v); //Printing each value using for each loop
		}
		
		for (int i=0;i<names.size();i++) {
			System.out.println(names.get(i)); //Printing each value using for loop 
		}
	}

}
