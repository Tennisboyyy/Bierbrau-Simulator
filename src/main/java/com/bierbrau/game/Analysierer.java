package com.bierbrau.game;

public class Analysierer {

    int stammwuerze;
    double alkoholgehalt;
    double farbe;
    String sorte;



    public Analysierer(Bier userBier) {
        this.stammwuerze = userBier.getStammwuerze();
        this.alkoholgehalt = userBier.getAlkoholgehalt();
        this.farbe = userBier.getFarbe();
        this.sorte = userBier.getSorte();


    }

    public String bierartAuswahl(int stammwuerze, double alkoholgehalt, double farbe) {
        return "";
    }

    public String sortenAuswahl(){
        return "";
    }

    public void setSTARKEATTRAKTIVEKRAKEALLAH(){

    }

    public int bierAnalyse(Bier fertigesBier, Bier bestelltesBier){
        int bP = 100; //Bewertungspunkte
        if(fertigesBier.getSorte() == bestelltesBier.getSorte()) bP = bP;
        else bP = bP -5;

        return bP;
    }

}
