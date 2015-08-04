package com.Marchbold.ocja.StrMethods;

public class startsWithApp {

	public static void main(String[] args) {
		
		//Initializing string 
		String name = "Marie Archbold";
		
		//Using boolean to check what the name starts with 
		boolean bol = name.startsWith("Ma");
		System.out.println(bol);
		
		bol = name.startsWith("Ar", 6);
		System.out.println(bol);

	}

}
