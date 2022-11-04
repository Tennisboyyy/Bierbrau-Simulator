package com.bierbrau.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BierbrauSimController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}