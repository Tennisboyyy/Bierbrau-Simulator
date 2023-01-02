package com.bierbrau.gui.ingame.abteilungen;

import com.bierbrau.game.Game;
import com.bierbrau.game.GameManager;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MaischenGUI {
    public Pane pane_Maischen;
    public ImageView image_Background;
    public Slider slider_BrennerStaerke;
    public ProgressBar progBar_Temp;
    public Label label_BrennerStaerke;
    public Button button_Brenner;
    public Label label_GameContent;
    public Label label_Tutorial;
    public Label label_Brenner;
    public Label label_Topf;
    public Label label_mixer;

    public boolean isAn = false;


    public void brennerAnAus(ActionEvent actionEvent) {


        if(!isAn){
            isAn = true;
            button_Brenner.setText("Brenner an");
            GameManager.game.getMaischen().erhitzen();
        }else{
            isAn = false;
            button_Brenner.setText("Brenner aus");
        }




    }

    public void malzHinzugabe(ActionEvent actionEvent) {
        GameManager.game.getMaischen().malzHinzugabe();
    }
}
