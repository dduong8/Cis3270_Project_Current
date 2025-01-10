package org.example.cis3270_project_current.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private AnchorPane LoginPageAnchor;

    @FXML
    void onMainMenuClick(ActionEvent event) throws IOException {
        new SceneController(LoginPageAnchor, "main-menu.fxml");

    }

    @FXML
    void onForgotPassClick(ActionEvent event) throws IOException {
        new SceneController(LoginPageAnchor, "ForgotPassPage.fxml");
    }

}