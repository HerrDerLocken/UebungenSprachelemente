package uebung.thema01.aufgabe03;

public class Aufgabe {
    public void pruefePalindrom(String text) {
        // Leerzeichen entfernen und in Kleinbuchstaben umwandeln, um robuster zu prüfen
        String bereinigt = text.replaceAll("\\s+", "").toLowerCase();

        StringBuffer sb = new StringBuffer(bereinigt);
        String gespiegelt = sb.reverse().toString();

        System.out.println("Eingabe: " + text);
        System.out.println("Gespiegelt (ohne Leerzeichen): " + gespiegelt);

        if (bereinigt.equals(gespiegelt)) {
            System.out.println("-> Es handelt sich um ein Palindrom!\n");
        } else {
            System.out.println("-> Es ist KEIN Palindrom.\n");
        }
    }
}