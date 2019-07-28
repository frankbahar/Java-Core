package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	Printer printer= new Printer("myPrinter",50,true);
	Printer printer1= new Printer("your printer",70,false);
	printer.printPages(6);
	printer1.printPages(6);
	System.out.println(printer.getName()+ " has tone level " + printer.getTonerLevel() + "printed " + printer.getPagePrinted()+" pages");
	System.out.println(printer1.getName()+ " has tone level " + printer1.getTonerLevel() + "printed " + printer1.getPagePrinted()+" pages");
    }
}
