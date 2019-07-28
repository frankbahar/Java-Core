package com.frankbahar;

public class DeluxeHamburger extends Hamburger {
    DeluxeHamburger(String rollType, String meat, long price){
        super("Deluxe Hambruger", rollType,meat,price);
    }
    @Override
    public long calculatePrice() {
        super.setAddition1("chips", 1);
        super.setAddition2("drinks", 2);
        long totalPrice = super.calculatePrice();
        return totalPrice;
    }

    @Override
    public void setAddition1(String addition, long price) {
        System.out.println("cannot add addtional item to deluxe burger");
    }

    @Override
    public void setAddition2(String addition, long price) {
        System.out.println("cannot add addtional item to deluxe burger");
    }
    @Override
    public void setAddition3(String addition, long price) {
        System.out.println("cannot add addtional item to deluxe burger");
    }

    @Override
    public void setAddition4(String addition, long price) {
        System.out.println("cannot add addtional item to deluxe burger");
    }
}
