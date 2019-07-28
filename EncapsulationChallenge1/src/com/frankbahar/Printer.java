package com.frankbahar;

public class Printer {
    private String name;
    private int tonerLevel;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(String name, int tonerLevel, boolean isDuplex) {
        this.name = name;
        if (tonerLevel > -1 && tonerLevel <=100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel=-1;
        this.pagePrinted = 0;
        this.isDuplex = isDuplex;
    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
    public int addToner(int tonerAmount ){
        if (tonerLevel > 0 && tonerLevel <=100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else return -1;
    }
    public void printPages(int pagePrinted){
        if (tonerLevel <= 0)
            System.out.println("Replace Tone on Printer " + this.name);
        else {
            System.out.println("Printer " + this.name + " printed " + pagePrinted + "pages.");
            if (this.isDuplex) {
                this.pagePrinted += pagePrinted / 2 + (pagePrinted % 2);
            } else
                this.pagePrinted+=pagePrinted;
            tonerLevel--;
            if (tonerLevel < 0)
                tonerLevel=0;
        }
    }
}
