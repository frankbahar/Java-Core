package com.frankbahar;

public class HealthyHamburger extends Hamburger{
    private String addition5;
    private String addition6;
    private long addition5Price;
    private long addition6Price;
    HealthyHamburger(String meat, long price){
        super("Healty Hamburger","Brown rye bread roll",meat,price);
        this.addition5="";
        this.addition6="";
        this.addition5Price=0;
        this.addition6Price=0;
    }

    public void setAddition5(String addition, long price) {
        this.addition5 = addition;
        this.addition5Price = price;
    }

    public void setAddition6(String addition, long price) {
        this.addition6 = addition;
        this.addition6Price = price;
    }
    @Override
    public long calculatePrice() {
        long totalPrice = super.calculatePrice();
        if (this.addition5 != "") {
            totalPrice += addition5Price;
            System.out.print(" " + this.addition5 + " " + this.addition5Price);
        }
        if (this.addition6 != "") {
            totalPrice += addition6Price;
            System.out.print(" " + this.addition6 + " " + this.addition6Price);
        }
        return totalPrice;
    }
}
