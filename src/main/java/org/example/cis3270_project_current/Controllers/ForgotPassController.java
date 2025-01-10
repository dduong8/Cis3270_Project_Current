package org.example.cis3270_project_current.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ForgotPassController {

    @FXML
    private AnchorPane ForgotPassAnchor;

    @FXML
    void onMainMenuClick(ActionEvent event) throws IOException {
        new SceneController(ForgotPassAnchor, "main-menu.fxml");

    }

}
