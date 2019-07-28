package com.frankbahar;
class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        this.engine = true;
        System.out.println("Engine started");
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Speed is : " + this.speed);
    }

    public void breakcar(int speed) {
        this.speed -= speed;
        System.out.println("Speed is : " + this.speed);
    }
}
class Acura extends Car {
    public Acura(int cylinders) {
        super("Acura MDX ", cylinders);
    }
    @Override
    public void accelerate(int speed) {
        if (speed <=10)
            System.out.println("Acura cannot increase less than 10 : ");
        else{
            this.speed += speed;
            System.out.println("Speed is : " + this.speed);
        }
    }

}
class Cadillac extends Car {
    public Cadillac(int cylinders) {
        super("Cadillac SRX ", cylinders);
    }
    @Override
    public void accelerate(int speed) {
        if (speed <=5)
            System.out.println("Cadillac SRX cannot increase less than 5 : ");
        else{
            this.speed += speed;
            System.out.println("Speed is : " + this.speed);
        }
    }

}
class BMW extends Car {
    public BMW(int cylinders) {
        super("BMW ", cylinders);
    }
}

public class Main {

    public static void main(String[] args) {
	Car car1 = new Acura(6);
	Car car2 = new Cadillac(6);
	Car car3 = new BMW(4);
	car1.accelerate(3);
	car2.accelerate(3);
	car3.accelerate(3);
    }
}
