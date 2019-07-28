package com.frankbahar;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts contact){
        if (findContact(contact.getName()) >=0 ) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact is added");
        return true;
    }
    public void printContacts(){
        System.out.println("You have "+ myContacts.size() + " contacts in your phone book");
        for(int i=0;i < myContacts.size();i++)
            System.out.println((i+1)+" . " + this.myContacts.get(i).getName() + " -> " +
                                             this.myContacts.get(i).getPhone());
    }
    public boolean removeContact(Contacts contact){
        int position = findContact(contact);
        if (position >= 0) {
            System.out.println(contact.getName() + " was removed");
            this.myContacts.remove(position);
            return true;
        }
        else {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
    }
    private int findContact(Contacts contact){
        return  this.myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for(int i=0;i<this.myContacts.size();i++){
            Contacts contact= this.myContacts.get(i);
            if (contact.getName().equals(name))
                return i;
        }
        return -1;
    }
    public String queryContact(Contacts contact){
        int position = findContact(contact);
        if (findContact(contact) >= 0)
            return contact.getName();
        return null;
    }
    public Contacts queryContact(String name){
        int position = findContact(name);
        if (position >= 0)
            return this.myContacts.get(position);
        return null;
    }
    public boolean modifyContact(Contacts oldContact, Contacts newContact){
        int position =  findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exist. Update was not successfull");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }
}
