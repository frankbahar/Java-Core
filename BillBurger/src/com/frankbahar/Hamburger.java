package com.frankbahar;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private long price;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private long addition1Price;
    private long addition2Price;
    private long addition3Price;
    private long addition4Price;


    public Hamburger(String name, String rollType, String meat, long price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
        this.addition1 = "";
        this.addition2 = "";
        this.addition3 = "";
        this.addition4 = "";
        this.addition1Price = 0;
        this.addition2Price = 0;
        this.addition3Price = 0;
        this.addition4Price = 0;
    }

    public void setAddition1(String addition, long price) {
        this.addition1 = addition;
        this.addition1Price = price;
    }

    public void setAddition2(String addition, long price) {
        this.addition2 = addition;
        this.addition2Price = price;
    }

    public void setAddition3(String addition, long price) {
        this.addition3 = addition;
        this.addition3Price = price;
    }

    public void setAddition4(String addition, long price) {
        this.addition4 = addition;
        this.addition4Price = price;
    }

    public long calculatePrice() {
        long totalPrice = this.price;
        System.out.print(this.name + " Base price: " +  this.price);
        if (this.addition1 != "") {
            totalPrice += addition1Price;
            System.out.print( " " +  this.addition1 + " " + this.addition1Price);
        }
        if (this.addition2 != "") {
            totalPrice += addition2Price;
            System.out.print(" "+ this.addition2 + " " + this.addition2Price);
        }
        if (this.addition3 != "") {
            totalPrice += addition3Price;
            System.out.print(" " + this.addition3 + " " + this.addition3Price);
        }
        if (this.addition4 != "") {
            totalPrice += addition4Price;
            System.out.print(" " + this.addition4 + " " + this.addition4Price);
        }
        return totalPrice;
    }
}