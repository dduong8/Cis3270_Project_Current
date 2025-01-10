package org.example.cis3270_project_current.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private AnchorPane MainMenuAnchor;

    @FXML
    void onLoginClick(ActionEvent event) throws IOException {
        new SceneController(MainMenuAnchor, "login-page.fxml");

    }

    @FXML
    void onRegisterClick(ActionEvent event) throws IOException {
        new SceneController(MainMenuAnchor, "register-page.fxml");
    }
}