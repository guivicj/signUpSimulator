module org.example.signupsimulator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.desktop;

    opens org.example.signupsimulator to javafx.fxml;
    exports org.example.signupsimulator;
}