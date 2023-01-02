package com.bierbrau.gui.ingame.abteilungen;

import com.bierbrau.game.GameManager;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class LaeuternGUI {
    public Button becherFuellenButton;
    public Button becherEingiessenButton;
    public Pane fluessigkeitsStrahl;
    public ImageView becherLinks;
    public ImageView becherRechts;
    public TextArea tutorial;

    public void becherFuellen(ActionEvent actionEvent) {
        GameManager.game.getLaeutern().becherFuellen();
    }

    public void becherEingiessien(ActionEvent actionEvent) {

    }



}
