package uebung.thema01.aufgabe05;

public class Aufgabe {

    public boolean isprime(int x, int y) {
        if (y <= 1) return false;
        if (x >= y) return true; // if x >= y then true
        if (y % x == 0) return false; // else (y mod x) != 0 muss erfüllt sein

        return isprime(x + 1, y); // UND pr(x+1, y)
    }
}