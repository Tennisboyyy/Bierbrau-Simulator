package com.bierbrau.game.abteilungen;

import java.io.Serializable;

public class Maischen implements Serializable {
    double temp = 0;

    public void erhitzen(){
        System.out.print("Schwänz");
        int time = 0;
        while(true){//Timer der hochgeht solange Topf über Brenner
            time++;
            temp += 0.2;
        }
    }
    public void malzHinzugabe(){
    }
    public void ruehren(){
    }

    public void warten(){

    }

}
