module com.uiejemlos.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemlos.demo to javafx.fxml;
    exports com.uiejemlos.demo;
}