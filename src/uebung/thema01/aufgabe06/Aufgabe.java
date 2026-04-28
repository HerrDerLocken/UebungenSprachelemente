package uebung.thema01.aufgabe06;

import java.math.BigInteger;

public class Aufgabe {
    // BigInteger ist nötig, da ab 13! der normale 'int' und ab 21! der 'long' überlaufen würde
    public BigInteger berechneFakultaet(int n) {
        BigInteger ergebnis = BigInteger.ONE; //startwert 1 (Fakultät: 1*2*....)
        for (int i = 2; i <= n; i++) { //von 2 beginnend bis zur gegeben Zahl n dass ergebnis mit der nächsten Zahl multiplizieren
            ergebnis = ergebnis.multiply(BigInteger.valueOf(i));
            //.multiply(BigInterger.valueOf(i) verwenden, da BigInteger ein Objekt ist und um i zu einem BigInteger zu machen
        }
        return ergebnis;
    }
}