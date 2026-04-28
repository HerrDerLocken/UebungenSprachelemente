package uebung.thema01.aufgabe04;

public class Main {
    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe();
        String zahlString = "2.0";
        double zahlDouble = Double.parseDouble(zahlString);

        System.out.println("Newton Verfahren: " + aufgabe.berechneWurzel(zahlString));
        System.out.println("Math.sqrt(x)    : " + Math.sqrt(zahlDouble));
    }
}