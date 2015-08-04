package com.Marchbold.ocja.StrMethods;
public class endsWithApp {

	public static void main(String[] args) {
		
		//Initializing String 
		String name = "Marie Archbold";
		
		//Using boolean and the ends with method to check for true or false 
		boolean bol = name.endsWith("Ma");
		System.out.println(bol);
		
		bol = name.endsWith("bold");
		System.out.println(bol);
		
		bol = name.endsWith("ie");
		System.out.println(bol);
		
		bol = name.endsWith("d");
		System.out.println(bol);

	}

}
