package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        ITelephone  frankPhone;
        frankPhone = new DeskPhone(123456);
        frankPhone.powerOn();
        frankPhone.callPhone(123456);
        frankPhone.answer();


        frankPhone = new MobilePhone(654321);
        frankPhone.powerOn();
        frankPhone.callPhone(654321);
        frankPhone.answer();
    }
}
