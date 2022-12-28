package com.bierbrau.game.abteilungen;

import com.bierbrau.game.Bier;
import com.bierbrau.game.GameManager;
import org.tools.tasks.AsyncTask;
import org.tools.tasks.DelayedTask;

import java.io.Serializable;

public class Laeutern implements Serializable {

    private int becherMenge;
    private int abgefüllteMenge;

    // === wird aufgerufen wenn der Becher gefüllt werden soll mit dem Bier (Linker Topf)
    public void becherFuellen() {
        if(becherMenge == 0) {
            int biermenge = GameManager.game.getAktuellesBier().getBierMenge() - abgefüllteMenge;
            if(biermenge != 0 && biermenge >= 2000) {
                abgefüllteMenge += 2000;
                becherMenge = 2000;


                // === Becher erkennbar voll machen in der GUI und auf die Rechte seite verschieben


            } else {
                abgefüllteMenge += biermenge-abgefüllteMenge;
                becherMenge = biermenge-abgefüllteMenge;
            }
        }
    }

    public void becherLeeren() {

        // === Graphisches einfüllen starten

        new DelayedTask(1.5) { //-> Started das aus "method" nach 1.5 sekunden asynchron
            @Override
            public void method() {
                int biermenge = GameManager.game.getAktuellesBier().getBierMenge() - abgefüllteMenge;
                becherMenge = 0;


                // === Grahpisches einfüllen beenden, Becher sichtbar leermachen und Becher auf die Linke seite verschieben


                if(biermenge == 0) {
                    GameManager.game.getAktuellesBier().setLaeutern(true);
                }
            }
        };
    }

}
