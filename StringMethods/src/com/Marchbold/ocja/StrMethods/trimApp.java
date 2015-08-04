package com.Marchbold.ocja.StrMethods;

public class trimApp {

	public static void main(String[] args) {
		
		//Initalize string with values 
		String name = " Marie Archbold ";
		
		name = name.trim(); 
		System.out.println(name);
		
		String str = " file";
		str = str.trim();
		System.out.println(str);
		
		//converts all letters to lowercase
		name = name.toLowerCase();				//marie archbold
		System.out.println(name);
		
		//converts all letters to uppercase
		name = name.toUpperCase();				//MARIE ARCHBOLD
		System.out.println(name);

	}

}
