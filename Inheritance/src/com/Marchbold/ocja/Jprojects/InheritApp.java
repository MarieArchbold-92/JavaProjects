package com.Marchbold.ocja.Jprojects;

public class InheritApp {

	public static void main(String[] args) {

		InheritApp ia = new InheritApp();
		ia.startProgram();

	}

	//method to give names and print out
	private void startProgram() {
		Person p1 = new Person("Ray");
		System.out.println(p1);

		Person p2 = new Person("Paul");
		System.out.println(p2);

		Cat kitten1 = new Cat("Felix");
		System.out.println(kitten1);

		Dog puppy1 = new Dog("Tobey");
		System.out.println(puppy1);

		Duck duckling = new Duck("Donald");
		System.out.println(duckling);		

		//Giving actions to speak and move
		this.Talk(p1);
		this.Talk(p2);
		this.Talk(kitten1);
		this.Talk(puppy1);
		this.Talk(duckling);

		this.moveIt(p1);
		this.moveIt(p2);
		this.moveIt(kitten1);
		this.moveIt(puppy1);
		this.moveIt(duckling);

		this.goToSleep(p1);
		this.goToSleep(p2);
		this.goToSleep(kitten1);
		this.goToSleep(puppy1);
		this.goToSleep(duckling);

	}


	private void Talk(Animal anim){
		anim.makeNoise();
	}

	private void moveIt(Animal anim){
		anim.move();
	}

	private void goToSleep(Animal anim){
		anim.sleep();
	}



}
