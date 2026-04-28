package uebung.thema01.aufgabe02;

public class Aufgabe {
    public void testeZahlenbereich(int start, int ende) {
        for (int i = start; i <= ende; i++) {
            if (istFroehlich(i)) {
                System.out.println(i + " ist eine fröhliche Zahl");
            } else {
                System.out.println(i + " ist eine traurige Zahl");
            }
        }
    }

    private boolean istFroehlich(int n) {
        // Wiederhole bis wir 1 (fröhlich) oder 4 (traurig/Zyklus) erreichen
        while (n != 1 && n != 4) {
            int summe = 0;
            while (n > 0) {
                int ziffer = n % 10;
                summe += ziffer * ziffer;
                n /= 10;
            }
            n = summe;
        }
        return n == 1;
    }
}