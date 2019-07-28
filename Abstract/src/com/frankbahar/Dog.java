package com.frankbahar;

public class Dog extends Animal {

    public Dog (String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getname() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }
}
