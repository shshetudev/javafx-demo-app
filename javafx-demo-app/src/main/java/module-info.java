module com.shshetudev.javafxdemoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.shshetudev.javafxdemoapp to javafx.fxml;
    exports com.shshetudev.javafxdemoapp;
}