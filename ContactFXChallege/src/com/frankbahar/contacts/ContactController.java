package com.frankbahar.contacts;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

    public class ContactController {

        @FXML
        private TextField firstName;

        @FXML
        private TextField lastName;

        @FXML
        private TextField phoneNumber;

        @FXML
        private TextArea notesArea;

        public Contact getNewContact() {
            String fName = firstName.getText().trim();
            String lName = lastName.getText().trim();
            String phone = phoneNumber.getText().trim();
            String notes = notesArea.getText().trim();

            Contact newContact = new Contact(fName, lName, phone,notes);
            return newContact;
        }

        public void editContact(Contact contact) {
            firstName.setText(contact.getFirstName());
            lastName.setText(contact.getLastName());
            phoneNumber.setText(contact.getPhoneNumber());
            notesArea.setText(contact.getNotes());
        }
        public void updateContact(Contact contact) {
            contact.setFirstName(firstName.getText().trim());
            contact.setLastName(lastName.getText().trim());
            contact.setPhoneNumber(phoneNumber.getText().trim());
            contact.setNotes(notesArea.getText().trim());
        }
    }
