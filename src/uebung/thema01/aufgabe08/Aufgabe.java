package uebung.thema01.aufgabe08;

import java.util.Random;

public class Aufgabe {

    // a) Zählt, wie oft eine vorgegebene Sequenz vorkommt
    public int zaehleSequenz(String sequenz) {
        StringPi piData = new StringPi();
        String piText = piData.PI;

        int count = 0;
        int index = 0;

        // indexOf sucht ab 'index' das nächste Vorkommen
        while ((index = piText.indexOf(sequenz, index)) != -1) {
            count++;
            index++; // Wir schieben den Index um 1 weiter, um auch überlappende Treffer zu finden
        }
        return count;
    }

    // b) Generiert eine zufällige 4-stellige Folge und zählt diese
    public void sucheZufaelligeFolge() {
        Random rand = new Random();
        // Erzeugt zufällige Zahl zwischen 0 und 9999 und füllt ggf. mit Nullen vorne auf
        String zufallsSequenz = String.format("%04d", rand.nextInt(10000));

        int anzahl = zaehleSequenz(zufallsSequenz);
        System.out.println("Die zufällige Sequenz '" + zufallsSequenz + "' kommt " + anzahl + " mal vor.");
    }
}