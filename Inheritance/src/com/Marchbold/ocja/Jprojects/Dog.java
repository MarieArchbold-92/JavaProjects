package com.Marchbold.ocja.Jprojects;

public class Dog extends Animal {

	private static final String SOUND = "Woof!";

	//Making a call to the animal class and attributes there
	Dog(String name){

		//Giving sound and name
		super(name, Dog.SOUND);
	}

	public void sleep(){
		System.out.println("Dog is sleeping ...");
	}
}
