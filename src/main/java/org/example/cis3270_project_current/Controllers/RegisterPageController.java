package org.example.cis3270_project_current.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RegisterPageController {

    @FXML
    private AnchorPane RegisterAnchor;

    @FXML
    void onMainMenuClick(ActionEvent event) throws IOException {
        new SceneController(RegisterAnchor, "main-menu.fxml");
    }

}
