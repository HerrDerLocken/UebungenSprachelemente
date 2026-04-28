package uebung.thema02.aufgabe02;

public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private double sideA() { return p2.distanceTo(p3); }
    private double sideB() { return p1.distanceTo(p3); }
    private double sideC() { return p1.distanceTo(p2); }

    /** Berechnet den Umfang des Dreiecks. */
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }

    /**
     * Berechnet die Fläche mit der Heronischen Formel:
     *   s = (a + b + c) / 2
     *   A = sqrt( s*(s-a)*(s-b)*(s-c) )
     */
    public double getArea() {
        double a = sideA();
        double b = sideB();
        double c = sideC();
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return String.format(
                "Triangle{ P1=%s, P2=%s, P3=%s, Umfang=%.4f, Fläche=%.4f }",
                p1, p2, p3, getPerimeter(), getArea());
    }
}