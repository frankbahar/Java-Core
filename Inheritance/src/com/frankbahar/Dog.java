package com.frankbahar;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dow.eat() called ");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
       System.out.println("Dow.move() called ");
       moveLegs(speed);
       super.move(speed);
   }

    public void walk(){
        System.out.println("Dow.walk() called ");
        super.move(5);

    }
    public void run (){
        System.out.println("Dow.run() called ");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dow.moveLegs() called ");
    }

}