package com.frankbahar;

public class Gearbox {
    private boolean clutchIsIn;
    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
