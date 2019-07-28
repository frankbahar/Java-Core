package com.frankbahar;

public class Windows {
    String name;
    Dimensions dimensions;
    Boolean isOpen;

    public Windows(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
        this.isOpen=false;
    }
    public void open(){
        if (this.isOpen)
            System.out.println("Window is already open");
        else {
            this.isOpen=true;
            System.out.println("Window opened");
        }
    }
    public void close(){
        if (!this.isOpen)
            System.out.println("Window is already closed");
        else {
            this.isOpen=true;
            System.out.println("Window closed");
        }
    }

    public Boolean getOpen() {
        return isOpen;
    }
}
