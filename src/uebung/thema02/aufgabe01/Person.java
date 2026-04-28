package uebung.thema02.aufgabe01;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate gebDat;

    public Person(String name, LocalDate gebDat) {
        this.name = name;
        this.gebDat = gebDat;
    }

    public String getName() {
        return name;
    }

    public LocalDate getGebDat() {
        return gebDat;
    }

    /**
     * Gibt true zurück, wenn der Geburtstag im aktuellen Jahr noch nicht stattgefunden hat.
     */
    public boolean geburtstag() {
        LocalDate heute = LocalDate.now();
        LocalDate geburtsdatumDiesesJahr = gebDat.withYear(heute.getYear());
        return geburtsdatumDiesesJahr.isAfter(heute);
    }

    /**
     * Berechnet das Alter der Person unter Berücksichtigung,
     * ob der Geburtstag im aktuellen Jahr bereits war.
     */
    public int alter() {
        LocalDate heute = LocalDate.now();
        int alter = heute.getYear() - gebDat.getYear();
        // Noch kein Geburtstag dieses Jahr → ein Jahr abziehen
        if (geburtstag()) {
            alter--;
        }
        return alter;
    }

    @Override
    public String toString() {
        String geburtstagsInfo = geburtstag()
                ? "Geburtstag steht noch aus"
                : "Geburtstag war bereits";
        return String.format("Person{name='%s', geboren=%s, Alter=%d, %s}",
                name, gebDat, alter(), geburtstagsInfo);
    }
}
