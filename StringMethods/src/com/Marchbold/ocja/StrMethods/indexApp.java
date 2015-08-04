package com.Marchbold.ocja.StrMethods;
public class indexApp {

	public static void main(String[] args) {
		
		String name = "Marie Archbold";
		
		int id = name.indexOf("ri");
		id = name.indexOf("ri", 4);
		id = name.indexOf("r");
		id = name.indexOf("r", 4);
		
		System.out.println(id);

	}

}
