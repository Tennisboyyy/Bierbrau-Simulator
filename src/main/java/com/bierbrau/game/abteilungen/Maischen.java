package com.bierbrau.game.abteilungen;

import com.bierbrau.game.GameManager;
import com.bierbrau.gui.ingame.abteilungen.MaischenGUI;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import org.tools.tasks.AsyncTask;

import java.io.Serializable;



public class Maischen implements Serializable {
    double temp = 0;
    int timer = 0;
    private MaischenGUI mGUI = (MaischenGUI) GameManager.ingameGUI.getGuiController().get(0);

    public void erhitzen(){

        final int[] time = {0};
                while(mGUI.isAn){//Timer der hochgeht solange Topf über Brenner
                    Timeline timer1 = new Timeline(new KeyFrame(Duration.seconds(2), ev -> {

                        time[0]++;
                        temp += 0.2;

                    })); timer1.play();
                }
                while (!mGUI.isAn){
                    Timeline timer2 = new Timeline(new KeyFrame(Duration.seconds(2), ev -> {
                    time[0]++;
                    temp -= 0.2;
                    }));timer2.play();
                }

                timer = time[0];

        }






    public void malzHinzugabe(){

    }
    public void ruehren(){
    }

    public void warten(){

    }

}
