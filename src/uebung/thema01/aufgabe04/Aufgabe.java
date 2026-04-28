package uebung.thema01.aufgabe04;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Aufgabe{
    public BigDecimal berechneWurzel(String xStr) {
        BigDecimal x = new BigDecimal(xStr);
        BigDecimal q = BigDecimal.ONE;
        BigDecimal eps = new BigDecimal("1E-41"); // Etwas genauer als 40 Stellen
        BigDecimal zwei = new BigDecimal("2");
        MathContext mc = new MathContext(50, RoundingMode.HALF_UP); // Rechengenauigkeit

        // Abbruchbedingung: |x - q^2| < eps
        while (x.subtract(q.multiply(q)).abs().compareTo(eps) >= 0) {
            // q = (q + x/q) / 2
            BigDecimal temp = x.divide(q, mc);
            q = q.add(temp).divide(zwei, mc);
        }
        // Auf exakt 40 Nachkommastellen runden
        return q.setScale(40, RoundingMode.HALF_UP);
    }
}