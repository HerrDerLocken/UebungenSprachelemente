package uebung.thema01.aufgabe07;

public class Main {
    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe();

        System.out.println("10 in Dualzahl: " + aufgabe.konvertiereZuDual(10));
        System.out.println("1010 in Dezimal: " + aufgabe.konvertiereZuDezimal("1010"));
    }
}