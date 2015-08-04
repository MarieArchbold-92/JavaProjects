package com.Marchbold.ocja.Jprojects;

public class Person extends Animal{

	private static final String SOUND = "AGH!";
	//Constructor which takes the name
	Person(String name){
		super(name, Person.SOUND);
	}

	public void sleep(){
		System.out.println("Person is sleeping...");
	}
}
