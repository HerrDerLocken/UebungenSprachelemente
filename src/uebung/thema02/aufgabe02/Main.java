package uebung.thema02.aufgabe02;

public class Main {

    public static void main(String[] args) {

        // Rechtwinkliges Dreieck: 3-4-5
        Triangle t1 = new Triangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(0, 3));

        System.out.println("=== Dreieck 1 (3-4-5) ===");
        System.out.println(t1);
        System.out.printf("  Umfang  = %.4f (erwartet 12.0000)%n", t1.getPerimeter());
        System.out.printf("  Fläche  = %.4f (erwartet  6.0000)%n", t1.getArea());

        System.out.println();

        // Gleichseitiges Dreieck mit Seitenlänge 6
        double h = Math.sqrt(3) / 2.0 * 6;
        Triangle t2 = new Triangle(
                new Point(0, 0),
                new Point(6, 0),
                new Point(3, h));

        System.out.println("=== Dreieck 2 (gleichseitig, a=6) ===");
        System.out.println(t2);
        System.out.printf("  Umfang  = %.4f (erwartet 18.0000)%n", t2.getPerimeter());
        System.out.printf("  Fläche  = %.4f (erwartet ~15.5885)%n", t2.getArea());
    }
}