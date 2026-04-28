package uebung.thema01.aufgabe08;

public class Main {

    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe();

        System.out.println("--- Aufgabe 8: Pi-String durchsuchen ---");

        // a) Vorgegebene Sequenz "1234" suchen
        String suchText = "1234";
        int anzahl = aufgabe.zaehleSequenz(suchText);
        System.out.println("Die vorgegebene Sequenz '" + suchText + "' kommt " + anzahl + " mal vor.");

        // b) Zufällige 4-stellige Sequenz suchen
        aufgabe.sucheZufaelligeFolge();

        System.out.println(Integer.MAX_VALUE);
    }
}