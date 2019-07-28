package com.frankbahar;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("001 973 445 85 45");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter action(6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilephone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    public static void printActions(){
        System.out.println("\nAvailable Actions:\npress ");
        System.out.println("\t 0 - To shutdown.\n" +
                            "\t 1 - To print contacts.\n" +
                            "\t 2 - To add new contact.\n" +
                            "\t 3 - To update contact.\n" +
                            "\t 4 - To remove an contact.\n" +
                            "\t 5 - To query if and contact exists.\n" +
                            "\t 6 - To print a list of available actions.\n");
        System.out.println("Choose your action: ");
    }
    private static void addContact(){
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phone);
        if(mobilephone.addContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        }
        else {
            System.out.println("Cannot add, " + name + "already on file");
        }
    }
    private static void updateContact(){
        System.out.print("Please enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contacts existingContact = mobilephone.queryContact(oldName);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newPhone);
        if (mobilephone.modifyContact(existingContact,newContact))
            System.out.println("Successfully updated record");
        else
            System.out.println("Could not update record");
    }
    public static void removeContact() {
        System.out.print("Please enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contacts existingContact = mobilephone.queryContact(oldName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilephone.removeContact(existingContact))
            System.out.println("Successfully removed record");
        else
            System.out.println("Could not remove the record");
    }
    public static void queryContact(){
        System.out.print("Please enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contacts existingContact = mobilephone.queryContact(oldName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + "Phone # is: " + existingContact.getPhone());
    }
    private static void startPhone(){
        System.out.println("Starting phone...");
     }
}
