package com.frankbahar;

public class Doors {
    String name;
    Dimensions dimensions;
    boolean isOpen;

    public Doors(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
        this.isOpen = false;
    }
    public  void enter() {
        open();
        System.out.println("Somebody is in the room");
    }
    private void open(){
        if (this.isOpen)
            System.out.println("Door is already open");
        else {
            this.isOpen=true;
            System.out.println("Door opened");
        }
    }
    private void close() {
        if (!this.isOpen)
            System.out.println("Door is already closed");
        else {
            this.isOpen = true;
            System.out.println("Door closed");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}
