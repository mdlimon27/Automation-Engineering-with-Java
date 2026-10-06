package com.example.s;

public class TraditionalSwitch {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		String vName="Limon";
		
		//Traditional switch statement
		/*switch (vName) {
		case "Md":
			System.out.println("First Name");
			break;
		case "Shahajada":
			System.out.println("Middle Name");
			break;
		case "Imran":
			System.out.println("Last Name");
			break;
		case "Limon":
			System.out.println("Nick Name");
			break;
		default :
			System.out.println("Not a Name");		
		
		}*/
	
		//Traditional switch expression
		String vOutput=switch (vName) {
		case "Md":
			System.out.println("First Name");
			yield "Md";
		case "Shahajada":
			System.out.println("Middle Name");
			yield "Shahajada";
		case "Imran":
			System.out.println("Last Name");
			yield "Imran";
		case "Limon":
			System.out.println("Nick Name");
			yield "Limon";
		default :
			System.out.println("Not a Name");		
		    yield "Not a name";
		};
		
		System.out.println(vOutput);
		
	}

}
