package org.example.cis3270_project_current.Controllers;

import org.example.cis3270_project_current.DB.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginPageController {

    @FXML
    private AnchorPane LoginPageAnchor;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passwordPassField;

    @FXML
    void onMainMenuClick(ActionEvent event) throws IOException {
        new SceneController(LoginPageAnchor, "MainMenu.fxml");

    }

    @FXML
    void onForgotPassClick(ActionEvent event) throws IOException {
        new SceneController(LoginPageAnchor, "ForgotPassPage.fxml");
    }


    // Login error handling
    public void loginButtonOnAction(ActionEvent event) {

        if (userNameTextField.getText().isBlank() == false && passwordPassField.getText().isBlank() == false) {
            // loginMessageLabel.setText("A field is incorrect, try again");
            validateLogin();
        }
        else {
            loginMessageLabel.setText("Enter UserName and Password to Login");
        }

    }

    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "select count(1) from UserAccounts where username = '" + userNameTextField.getText() + "' and password = '" + passwordPassField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    loginMessageLabel.setText("Welcome");
                }
                else {
                    loginMessageLabel.setText("A field is incorrect, try again");
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}