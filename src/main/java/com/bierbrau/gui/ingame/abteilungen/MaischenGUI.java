package com.bierbrau.gui.ingame.abteilungen;

import com.bierbrau.game.GameManager;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MaischenGUI {
    public Pane pane_Maischen;
    public ImageView image_Background;
    public Slider slider_BrennerStaerke;
    public ProgressBar progBar_Temp;
    public Label label_BrennerStaerke;
    public ToggleButton button_Brenner;
    public Label label_GameContent;
    public Label label_Tutorial;
    public Label label_Brenner;
    public Label label_Topf;
    public Label label_mixer;


    public void brennerAnAus(ActionEvent actionEvent) {
        if(button_Brenner.isSelected()){
            GameManager.game.getMaischen().erhitzen();
        }


    }
}
