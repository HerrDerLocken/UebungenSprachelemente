package uebung.thema01.aufgabe06;

import java.math.BigInteger;

public class Aufgabe {
    // BigInteger ist nötig, da ab 13! der normale 'int' und ab 21! der 'long' überlaufen würde
    public BigInteger berechneFakultaet(int n) {
        BigInteger ergebnis = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            ergebnis = ergebnis.multiply(BigInteger.valueOf(i));
        }
        return ergebnis;
    }
}