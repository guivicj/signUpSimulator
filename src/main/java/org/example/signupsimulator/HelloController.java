package org.example.signupsimulator;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class HelloController {
    @FXML
    private Button btnSignUp;

    @FXML
    private Button btnValidateData;

    @FXML
    private Button btnSendData;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelephone;

    @FXML
    private SplitMenuButton countries;

    @FXML
    private MenuItem country1;

    @FXML
    private MenuItem country2;

    @FXML
    private CheckBox termsOK;

    @FXML
    private TabPane tabPane;

    @FXML
    private Label lblData;

    @FXML
    private Label lblDataSent;

    private String selectedCountry;

    @FXML
    protected void btnSignUpOnAction() {
        tabPane.getSelectionModel().select(1);
    }

    @FXML
    protected void btnValidateOnAction() {
        if (!txtUsername.getText().isEmpty() && !txtEmail.getText().isEmpty()
                && !txtTelephone.getText().isEmpty()
                && !selectedCountry.isEmpty() && termsOK.isSelected()) {
            String userData = "Name: " + txtUsername.getText()
                    + "\nEmail: " + txtEmail.getText() +
                    "\nTelephone: " + txtTelephone.getText()
                    + "\nCountry: " + selectedCountry;
            tabPane.getSelectionModel().select(2);
            lblData.setText(userData);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please, fill all the blanks");
            alert.show();
        }
    }

    @FXML
    protected void btnSendDataOnAction() {
        tabPane.getSelectionModel().select(3);
        lblDataSent.setText("You have registered successfully");
    }

    @FXML
    protected void selectedCountrySpain() {
        selectedCountry = country1.getText();
        countries.setText(selectedCountry);
    }

    @FXML
    protected void selectedCountryPortugal() {
        selectedCountry = country2.getText();
        countries.setText(selectedCountry);
    }
}