package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    Dimensions windowDimension= new Dimensions(120,20);
        Dimensions doorDimension= new Dimensions(200,50);
        Dimensions roomDimension= new Dimensions(1000,2000);
        Doors myroomDoor = new Doors("Fikret room Door",doorDimension);
        Windows myroomWindows = new Windows("Fikret room Window",windowDimension);
        Furniture desk = new Furniture("Desk","oak");
        Room myRoom = new Room("Fikret Room",roomDimension,myroomDoor,myroomWindows, desk);
        if (myRoom.windows.isOpen)
            System.out.println("fikret Room Window open" );
            else {
                 System.out.println("fikret Room Window was closed");
                 myRoom.windows.open();
                 System.out.println("fikret Room Window opened");
            }
        if (myRoom.doors.isOpen)
            System.out.println("fikret Room door open" );
        else {
            System.out.println("fikret Room door was closed");
            myRoom.doors.enter();
            System.out.println("fikret Room door entered");
        }
    }
}
