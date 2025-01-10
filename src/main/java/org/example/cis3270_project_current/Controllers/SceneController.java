package org.example.cis3270_project_current.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import org.example.cis3270_project_current.Main.AirlineReservation;

import java.io.IOException;
import java.util.Objects;


public class SceneController {
    public SceneController(AnchorPane currentAnchorPane, String fxml) throws IOException {
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(AirlineReservation.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
        // Removes everything from the current anchor pane and sets the next anchor pane being switched to
    }
}