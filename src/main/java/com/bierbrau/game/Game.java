package com.bierbrau.game;

import com.bierbrau.game.abteilungen.*;
import com.bierbrau.gui.ingame.IngameGUI;

import java.io.IOException;
import java.io.Serializable;

public class Game implements Serializable {

    private final Maischen maischen; //1
    private final Laeutern laeutern; //2
    private final HopfenKochen hopfenKochen; //3
    private final Abkuehlen abkuehlen; //4
    private final HefeGabe hefeGabe; //5
    private final Hauptgaerung hauptgaerung; //6
    private final Abfuellen abfuellen; //7
    private final Nachgaerung nachgaerung; //8
    private final Reifung reifung; //9
    private Bestellung aktuelleBestellung;

    public Game() {
        this.maischen = new Maischen();
        this.laeutern = new Laeutern();
        this.hopfenKochen = new HopfenKochen();
        this.abkuehlen = new Abkuehlen();
        this.hefeGabe = new HefeGabe();
        this.hauptgaerung = new Hauptgaerung();
        this.abfuellen = new Abfuellen();
        this.nachgaerung = new Nachgaerung();
        this.reifung = new Reifung();

        /*try {
           // GameManager.ingameGUI = new IngameGUI();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }

    public Maischen getMaischen() {
        return maischen;
    }

    public Laeutern getLaeutern() {
        return laeutern;
    }

    public HopfenKochen getHopfenKochen() {
        return hopfenKochen;
    }

    public Abkuehlen getAbkuehlen() {
        return abkuehlen;
    }

    public HefeGabe getHefeGabe() {
        return hefeGabe;
    }

    public Hauptgaerung getHauptgaerung() {
        return hauptgaerung;
    }

    public Abfuellen getAbfuellen() {
        return abfuellen;
    }

    public Nachgaerung getNachgaerung() {
        return nachgaerung;
    }

    public Reifung getReifung() {
        return reifung;
    }

    public Bestellung getAktuelleBestellung() {
        return aktuelleBestellung;
    }

    public void setAktuelleBestellung(Bestellung aktuelleBestellung) {
        this.aktuelleBestellung = aktuelleBestellung;
    }
}
