package com.frankbahar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryLists = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryLists.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;
            }
        }
	 }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 1 - To Quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter grocery item: ");
        groceryLists.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Please enter current item: ");
        String itemNumber = scanner.nextLine();
        System.out.print("Please enter replacement item: ");
        String newItem = scanner.nextLine() ;
        groceryLists.modifyGroceryItem(itemNumber,newItem);
    }
    public static void removeItem(){
        System.out.print("Please enter item: ");
        String itemNumber = scanner.nextLine();
        groceryLists.removeGroceryItem(itemNumber);
    }
    public static void searchForItem(){
        System.out.print("Please enter item to search: ");
        String searchItem = scanner.nextLine() ;
        if (groceryLists.onFile(searchItem))
            System.out.println("Found " +searchItem + "in our grocery list");
        else
            System.out.println(searchItem + " is not in the grocery list");
    }
    public static  void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryLists.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryLists.getGroceryList());
        String [] myArray = new String[groceryLists.getGroceryList().size()];
        myArray = groceryLists.getGroceryList().toArray(myArray);

    }
}
