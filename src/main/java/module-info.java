module com.example.myview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.myview to javafx.fxml;
    exports com.example.myview;
    exports View;
    opens View to javafx.fxml;
}