package com.Marchbold.ocja.Jprojects;

public class Cat extends Animal {

	private static final String SOUND = "Meow!";

	//Making a call to the parent class and the attributes there
	Cat(String name){
		super(name, Cat.SOUND);
	}
	
	public void sleep(){
		System.out.println("Cat is sleeping...");
	}

}
