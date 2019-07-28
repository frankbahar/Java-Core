package com.frankbahar;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getname() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getname() + " is flapping its wings");
    }
}
