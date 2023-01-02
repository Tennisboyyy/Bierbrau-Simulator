package com.bierbrau.gui.ingame;

import com.bierbrau.gui.ingame.abteilungen.LaeuternGUI;
import com.bierbrau.gui.ingame.abteilungen.MaischenGUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ArrayList;

public class IngameGUI {

    public static BorderPane aktuelleAbteilung;
    ArrayList<Pane> abteilungen;
    ArrayList<Object> guiController;
    private int index;

    private Pane maischen;
    private Pane laeutern;

    public IngameGUI() throws IOException {
        aktuelleAbteilung = new BorderPane();
        abteilungen = new ArrayList<>();
        guiController = new ArrayList<>();

        FXMLLoader maischenL = new FXMLLoader(IngameGUI.class.getResource("abteilungen/MaischenGUI.fxml"));
        maischen = (Pane) maischenL.load();
        guiController.add((MaischenGUI)maischenL.getController());

        FXMLLoader laeuternL = new FXMLLoader(IngameGUI.class.getResource("abteilungen/laeutern.fxml"));
        laeutern = (Pane) laeuternL.load();
        guiController.add((LaeuternGUI)laeuternL.getController());

        abteilungen.add(maischen);
        abteilungen.add(laeutern);

        HBox switcher = (HBox) FXMLLoader.load(IngameGUI.class.getResource("pageswitcher.fxml"));
        aktuelleAbteilung.setBottom(switcher);
        BorderPane topBar = (BorderPane) FXMLLoader.load(IngameGUI.class.getResource("topbar.fxml"));
        aktuelleAbteilung.setTop(topBar);

        aktuelleAbteilung.setCenter(abteilungen.get(0));
    }

    public void wechsel(int typ) {
        if(typ == 1) {
            if (index == abteilungen.size()-1) {
                index = 0;
            } else {
                index++;
            }
        } else if (typ == -1) {
            if (index == 0) {
                index = abteilungen.size()-1;
            } else {
                index--;
            }
        }
        aktuelleAbteilung.setCenter(abteilungen.get(index));
    }

    public ArrayList<Object> getGuiController() {
        return guiController;
    }

    public ArrayList<Pane> getAbteilungen() {
        return abteilungen;
    }
}
