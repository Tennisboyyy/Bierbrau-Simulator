module com.bierbrau.bierbrausimulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires Tools;


    opens com.bierbrau.main to javafx.fxml;
    exports com.bierbrau.main;
    exports com.bierbrau.game;
    opens com.bierbrau.game to javafx.fxml;
    exports com.bierbrau.gui;
    opens com.bierbrau.gui to javafx.fxml;
}