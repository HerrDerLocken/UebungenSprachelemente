package uebung.thema01.aufgabe01;

public class Aufgabe {

    public long berechneQuersumme(String riesigeZahl) {
        long quersumme = 0;
        for (char c : riesigeZahl.toCharArray()) {
            if (Character.isDigit(c)) {
                quersumme += Character.getNumericValue(c);
            }
        }
        return quersumme;
    }
}