package com.bierbrau.gui.ingame;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ArrayList;

public class IngameGUI {

    BorderPane aktuelleAbteilung;
    ArrayList<Pane> abteilungen;
    private int index;

    private Pane abteilung1;
    private Pane abteilung2;

    public IngameGUI() throws IOException {
        aktuelleAbteilung = new BorderPane();
        abteilungen = new ArrayList<>();

        abteilung1 = (Pane) FXMLLoader.load(IngameGUI.class.getResource(""));
        abteilung2 = (Pane) FXMLLoader.load(IngameGUI.class.getResource(""));

        abteilungen.add(abteilung1);
        abteilungen.add(abteilung2);

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

}
