package uebung.thema01.aufgabe05;

public class Aufgabe {

    public boolean isprime(int x, int y) {
        if (y <= 1) return false; // zahlen <=1 sind keine Primzahlen
        if (x >= y) return true; // Wenn der Teiler (x) gleich der zu prüfenden Zahl (y) ist, ist die Zahl prim
        if (y % x == 0) return false; // Wenn y ohne Rest durch x teilbar ist und nicht x >= y ist, ist y nicht prim

        return isprime(x + 1, y); //den nächsten Teiler prüfen
    }
}