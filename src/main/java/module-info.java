module org.example.cis3270_project_current {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.cis3270_project_current to javafx.fxml;
    exports org.example.cis3270_project_current.Registartion_Login;
    exports org.example.cis3270_project_current.Main;
    opens org.example.cis3270_project_current.Main to javafx.fxml;
}