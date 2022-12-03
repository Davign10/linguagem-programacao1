module Celular {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    opens com.example.celular to javafx.fxml;
    exports com.example.celular;
}
