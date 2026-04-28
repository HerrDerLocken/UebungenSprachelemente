package uebung.thema01.aufgabe06;

public class Main {
    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe();

        System.out.println("10! = " + aufgabe.berechneFakultaet(10));
        System.out.println("100! = " + aufgabe.berechneFakultaet(100));
        System.out.println("1000! = " + aufgabe.berechneFakultaet(1000));
    }
}