package com.Marchbold.ocja.StrMethods;

public class ReplaceApp {

	public static void main(String[] args) {
		
		//Initializing the string with a value
		String name = "Java Rocks";
		
		//using the replace method to replace letters 
		name = name.replace('a', 'o');
		name = name.replace("vo" ,"hn");
		name = name.replace("Ro", "ha");
		name = name.replace(' ' , '-');
		
		//printing out the name to the screen
		System.out.println(name);

	}

}