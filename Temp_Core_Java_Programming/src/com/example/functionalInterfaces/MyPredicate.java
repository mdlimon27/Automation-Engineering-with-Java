package com.example.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyPredicate {
	public static void main(String... Args) {
		System.out.println("Md Shahajada Imran");
		
		//Using predicate functional interface
		Predicate<Integer> objPe=v->v<100;		
		boolean vOutput=objPe.test(78);
		System.out.println(vOutput);
		
		//Using Function functional interface
		Function<String,Integer> objFunction=(vName)->vName.length();
		Integer vOutput2=objFunction.apply("Md Shahajada Imran");
		System.out.println("There are "+vOutput2+" letters including spaces in the given name");
		
		objFunction=(vName)->vName.replace(" ", "").length();
		vOutput2=objFunction.apply("Md Shahajada Imran");
		System.out.println("There are "+vOutput2+" letters excluding spaces in the given name");
		
		//Using Consumer functional interface
		Consumer<String> objConsumer=str->System.out.println("Md Shahajada Imran");
		objConsumer.accept("Print my Name");
		
		//Using Supplier Functional Interface
		Supplier<String> objSupplier=()->"my name is md shahajada imran. my core skills are scripting, QA, Testing, Test Lead, lead engineering, programming, Software engineering in Test, Automation Engineering etc.";
		String vOutput3=objSupplier.get();
		System.out.println(vOutput3);
		
	}
}
