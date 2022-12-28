package com.bierbrau.gui;

import com.bierbrau.game.Game;
import com.bierbrau.game.GameManager;
import com.bierbrau.gui.ingame.IngameGUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu {

    public Button settingsButton;
    public Button exitButton;
    public Button continueButton;
    public Button loadButton;
    public Button createButton;
    public BorderPane mainFrame;

    private VBox settings;
    {
        try {
            settings = (VBox) FXMLLoader.load(MainMenu.class.getResource("settings.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void settingsClick(ActionEvent actionEvent) {
        mainFrame.setCenter(settings);
    }

    public void achievementsClick(ActionEvent actionEvent) {
        //Öffne Achievements
    }

    public void exitClick(ActionEvent actionEvent) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public void continueClick(ActionEvent actionEvent) {
        try {
            GameManager.game = new Game();

            Pane abteilung1 = (Pane) FXMLLoader.load(IngameGUI.class.getResource("abteilungen/MaischenGUI.fxml"));
            mainFrame.setCenter(abteilung1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

      /*  String letzterSpielstand = "";
        try {
            GameManager.loadGame(letzterSpielstand);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }

    public void loadClick(ActionEvent actionEvent) {
        String spielstand = "";
        try {
            GameManager.loadGame(spielstand);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void createClick(ActionEvent actionEvent) {
        GameManager.game = new Game();
    }
}