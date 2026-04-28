package uebung.thema01.aufgabe01;

public class Main {
    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe();

        String zahl = "123456789";
        System.out.println("Quersumme von " + zahl + " ist: " + aufgabe.berechneQuersumme(zahl));

        String sehrGrosseZahl = "99999999999999999999999999999999999";
        System.out.println("Quersumme von " + sehrGrosseZahl + " ist: " + aufgabe.berechneQuersumme(sehrGrosseZahl));
    }
}