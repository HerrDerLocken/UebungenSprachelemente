package uebung.thema01.aufgabe05;

public class Main {
    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe();
        int[] testZahlen = {7, 10, 13, 100};

        for (int z : testZahlen) {
            System.out.println("Ist " + z + " prim? (Iterativ): " + aufgabe.isprime(2,z));
            System.out.println("-");
        }
    }
}