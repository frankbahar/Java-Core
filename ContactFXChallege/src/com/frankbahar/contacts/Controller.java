package com.frankbahar.contacts;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Controller {
    @FXML
    private TableView<Contact> tableView;
    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private TableColumn<Contact, String> firstName;

    @FXML
    private TableColumn<Contact, String> lastName;

    @FXML
    private TableColumn<Contact, String> phoneNumber;

    @FXML
    private TableColumn<Contact, String> notes;

    private ContactData data;

    public void initialize(){
        data= new ContactData();
        data.loadContacts();

        tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        tableView.setItems(data.getContacts());
        tableView.getSelectionModel().selectFirst();

    }

    public void showNewItemDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        dialog.setHeaderText("Use this dialog to create a new contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

         Optional<ButtonType> result = dialog.showAndWait();
          if(result.isPresent() && result.get() == ButtonType.OK) {
             com.frankbahar.contacts.ContactController controller = fxmlLoader.getController();
             Contact newItem = controller.getNewContact();
              data.addContact(newItem);
              data.saveContacts();
              tableView.getSelectionModel().select(newItem);
                //           System.out.println("OK pressed");
//        } else {
//            System.out.println("Cancel pressed");
            }


        }

    @FXML
    public void showEditItemDialog(){
        Contact selectedItem = tableView.getSelectionModel().getSelectedItem();
        if(selectedItem != null) {
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.initOwner(mainBorderPane.getScene().getWindow());
            dialog.setTitle("Edit Contact");
            dialog.setHeaderText("Use this dialog to edit contact");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("contactDialog.fxml"));

            try {
                Parent dialogContent = fxmlLoader.load();
                ContactController contactController = fxmlLoader.<ContactController>getController();
                contactController.editContact(selectedItem);
                dialog.getDialogPane().setContent(dialogContent);
            } catch (IOException e) {
                System.out.println("Couldn't load the dialog");
                e.printStackTrace();
                return;
            }
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                com.frankbahar.contacts.ContactController controller = fxmlLoader.getController();
                controller.updateContact(selectedItem);
                data.addContact(selectedItem);
                data.saveContacts();
                tableView.getSelectionModel().select(selectedItem);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Contact Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select the contact you want to edit.");
            alert.showAndWait();
            return;
        }

    }

    @FXML
    public void handleDelete() {
        Contact selectedItem = tableView.getSelectionModel().getSelectedItem();
        if(selectedItem != null){
           deleteItem(selectedItem);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Contact Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select the contact you want to delete.");
            alert.showAndWait();
            return;
        }
    }

    public void deleteItem(Contact item){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Contact");
        alert.setHeaderText("Delete Contact : " + item.toString());
        alert.setContentText("Are you sure ? Press OK to confirm, or Cancel to Back out.");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && (result.get() == ButtonType.OK)){
              data.deleteContact(item);
              data.saveContacts();
        }
    }
}
