package com.bierbrau.game;

public class Kunde {

    private String name;
    Bestellung bestellung;

    public Kunde(String name, Bier bier) {
        Bestellung b = new Bestellung(bier);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
