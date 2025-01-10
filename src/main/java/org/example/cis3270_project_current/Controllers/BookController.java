package org.example.cis3270_project_current.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BookController {

    @FXML
    private AnchorPane BookAnchor;

    @FXML
    void onMainMenuClick(ActionEvent event) throws IOException {
        new SceneController(BookAnchor, "main-menu.fxml");
    }

}
