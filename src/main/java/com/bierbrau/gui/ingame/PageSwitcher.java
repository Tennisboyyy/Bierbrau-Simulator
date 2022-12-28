package com.bierbrau.gui.ingame;

import com.bierbrau.game.Game;
import com.bierbrau.game.GameManager;
import javafx.event.ActionEvent;

public class PageSwitcher {
    public void previousClick(ActionEvent actionEvent) {
        GameManager.ingameGUI.wechsel(-1);
    }

    public void nextClick(ActionEvent actionEvent) {
        GameManager.ingameGUI.wechsel(1);
    }
}
