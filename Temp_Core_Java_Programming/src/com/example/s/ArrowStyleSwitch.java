package com.example.s;

public class ArrowStyleSwitch {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		String vName="Shahajada";
		
		//Arrow-Style switch statement
		/*switch (vName) {
		case "Md" -> System.out.println("First Name");
		case "Shahajada" -> System.out.println("Middle Name");
		case "Imran" ->System.out.println("Last Name");
		case "Limon" ->System.out.println("Nick Name");
		default ->System.out.println("Not a Name");
		}*/
		
		
		//Arrow-Style switch expression
		
		String vOutput=switch (vName) {
		case "Md" -> {System.out.println("First Name"); yield "First Name";}
		case "Shahajada" -> {System.out.println("Middle Name"); yield "Middle Name";}
		case "Imran" -> {System.out.println("Last Name"); yield "Last Name";}
		case "Limon" -> {System.out.println("Nick Name"); yield "Nick Name";}
		default ->{System.out.println("Not a Name"); yield "Not a Name";}
		};
		
		System.out.println(vOutput);
		
		
	}

}
