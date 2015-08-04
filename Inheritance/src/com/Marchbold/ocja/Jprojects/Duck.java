package com.Marchbold.ocja.Jprojects;

public class Duck extends Animal {

	private static final String SOUND = " Quack!";

	//Making a call to the parent class and attributes 
	Duck(String name){

		//Giving sound and name
		super(name, Duck.SOUND);
	}
	
	public void sleep(){
		System.out.println("Duck is sleeping...");
	}

}
