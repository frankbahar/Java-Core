package com.frankbahar.contacts;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    private SimpleStringProperty firstName = new SimpleStringProperty("");
    private SimpleStringProperty lastName = new SimpleStringProperty("");
    private SimpleStringProperty phoneNumber = new SimpleStringProperty("");
    private SimpleStringProperty notes = new SimpleStringProperty("");

    public Contact(String fName, String lName, String phone, String notes) {
        this.firstName.set(fName);
        this.lastName.set(lName);
        this.phoneNumber.set(phone);
        this.notes.set(notes);
    }

    public Contact() {
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        this.firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lName) {
        this.lastName.set(lName);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber.set(phone);
    }

    public String getNotes() {
        return notes.get();
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    @Override
    public String toString() {
        return "{" + " " +
                 firstName.get() +" " +
                 lastName.get() + " " +
                 phoneNumber.get() + " " +
                notes.get() +
                '}';
    }
}
