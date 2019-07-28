module JavaFX.Application {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;
    requires javafx.web;
    requires java.sql;
    requires java.xml;
    opens sample.model;
    opens sample;
}