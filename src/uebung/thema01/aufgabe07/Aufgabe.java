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
}