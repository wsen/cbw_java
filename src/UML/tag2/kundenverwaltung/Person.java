package UML.tag2.kundenverwaltung;

import java.util.Date;

public class Person {
    private String name;
    private String nachname;
    private Date gebDat;
    private static int personenAnzahl;
    private String geschlecht;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

