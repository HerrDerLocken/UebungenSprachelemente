package uebung.thema02.aufgabe01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();

        personen.add(new Person("Anna Müller",    LocalDate.of(1990,  3, 15)));
        personen.add(new Person("Max Mustermann", LocalDate.of(1985, 11, 20)));
        personen.add(new Person("Sophie Schmidt", LocalDate.of(2000,  LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth())));  // Heute Geburtstag!
        personen.add(new Person("Lukas Weber",    LocalDate.of(1978,  7,  4)));
        personen.add(new Person("Mia Becker",     LocalDate.of(1995,  1,  1)));

        System.out.println("=== Personenliste ===");
        System.out.println();
        for (Person p : personen) {
            System.out.println(p);
        }
    }
}
