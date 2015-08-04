package com.Marchbold.ocja.Jprojects;

public abstract class Animal {

	private String name;
	private String sound;

	public Animal(){
		this("NoSound", "NoName");
	}

	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}

	public void makeNoise(){
		System.out.println(this.name + " says " + this.sound);
	}

	public void move(){
		System.out.println("Moving....");
	}

	abstract public void sleep();
		
	
	public String toString(){
		return this.name;
	}
}
