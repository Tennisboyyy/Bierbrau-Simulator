package com.bierbrau.game;

public class Bier {

    private int stammwuerze;
    private double farbe;
    private double alkoholgehalt;
    private String name;
    private String sorte;
    private String hopfenNote;
    private String malzNote;
    private String hefeNote;
    private int bierMenge;


    public Bier(int stammwuerze, int farbe, int alkoholgehalt, String sorte) {
        this.stammwuerze = stammwuerze;
        this.farbe = farbe;
        this.alkoholgehalt = alkoholgehalt;
        this.name = name;
    }

    public int getStammwuerze() {
        return stammwuerze;
    }

    public void setStammwuerze(int stammwuerze) {
        this.stammwuerze = stammwuerze;
    }

    public double getFarbe() {
        return farbe;
    }

    public void setFarbe(double farbe) {
        this.farbe = farbe;
    }

    public double getAlkoholgehalt() {
        return alkoholgehalt;
    }

    public void setAlkoholgehalt(double alkoholgehalt) {
        this.alkoholgehalt = alkoholgehalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSorte() {
        return sorte;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    public String getHopfenNote(){
        return hopfenNote;
    }

    public void sethopfenNote(String hn){
        this.hopfenNote = hn;
    }

    public String getMalzNote(){
        return malzNote;
    }

    public void setMalzNote(String mN){
        this.malzNote = mN;
    }

    public String getHefeNote(){
        return hefeNote;
    }

    public void setHefeNote(String heN){
        this.hefeNote = heN;
    }

    public int getBierMenge(){
        return bierMenge;
    }

    public void setBierMenge(int bierMenge){
        this.bierMenge = bierMenge;
    }

}
