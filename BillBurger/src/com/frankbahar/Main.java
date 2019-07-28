package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        Hamburger myHamburger = new Hamburger("Base Hamburger","white","lamp",4);
        myHamburger.setAddition1("lettuce",2);
        myHamburger.setAddition2("tomato",3);
        myHamburger.setAddition3("carrot",1);
        System.out.println(" Total Price= " + myHamburger.calculatePrice());
        HealthyHamburger healtyhamburger = new HealthyHamburger("Fish",5);
        healtyhamburger.setAddition5("onion",3);
        healtyhamburger.setAddition1("lentil",1);
        System.out.println(" Total Price= " + healtyhamburger.calculatePrice());
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White","beef",3);
        deluxeHamburger.setAddition3("lentil",1);
        deluxeHamburger.setAddition4("lentil",1);
        System.out.println(" Total Price= " + deluxeHamburger.calculatePrice());
    }
}
