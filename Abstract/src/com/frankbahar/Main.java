package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
	    dog.breathe();
	    dog.eat();
	    Parrot parrot  = new Parrot ("Australian ringnek");
	    parrot.breathe();
	    parrot.eat();
		parrot.fly();
		Penguin penguin  = new Penguin("Emperor");
		penguin.breathe();
		penguin.eat();
		penguin.fly();
    }
}
