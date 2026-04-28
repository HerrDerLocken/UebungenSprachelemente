package uebung.thema01.aufgabe07;

public class Aufgabe {

    public String konvertiereZuDual(int zahl) {
        if (zahl == 0) return "0";
        StringBuilder dual = new StringBuilder();

        while (zahl > 0) {
            int rest = zahl % 2;
            dual.insert(0, rest);
            zahl = zahl / 2;
        }
        return dual.toString();
    }

    public int konvertiereZuDezimal(String dualZahl) {
        int dezimal = 0;
        for (int i = 0; i < dualZahl.length(); i++) {
            char ziffer = dualZahl.charAt(i);
            dezimal = dezimal * 2 + Character.getNumericValue(ziffer);
        }
        return dezimal;
    }

    public String konvertiereZuBasis(int zahl, int basis) {
        if (zahl == 0) return "0";
        StringBuilder ergebnis = new StringBuilder();

        while (zahl > 0) {
            int rest = zahl % basis;
            // Für Basis > 10 Buchstaben verwenden
            char zeichen = (char) (rest < 10 ? '0' + rest : 'A' + rest - 10);
            ergebnis.insert(0, zeichen);
            zahl = zahl / basis;
        }
        return ergebnis.toString();
    }
}