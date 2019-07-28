package com.frankbahar;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract  void eat();
    public abstract  void breathe();

    public  String getname(){
        return name;
    }
}
