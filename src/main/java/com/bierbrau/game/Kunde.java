package com.bierbrau.game;

import java.io.Serializable;

public class Kunde implements Serializable {

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
