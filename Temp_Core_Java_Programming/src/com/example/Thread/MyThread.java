package com.example.Thread;

public class MyThread {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		
		Runnable r=()->System.out.println("Imran");
		
		Thread t=new Thread(r);
		t.start();
		
	}

}
