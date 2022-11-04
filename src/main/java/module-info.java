module com.bierbrau.bierbrausimulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bierbrau.main to javafx.fxml;
    exports com.bierbrau.main;
}