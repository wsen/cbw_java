package tag4;
import java.util.Scanner;

public class A17_Quartalssumme {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        double monat1, monat2, monat3;
     //   System.out.print("Monat? ");
     //   String eingabe = sc.nextLine();
     //   double zahl = Double.parseDouble(eingabe);
     //   System.out.println(zahl);

        // statische Eingabe zur Vereinfachung
        quartalssumme(936.42, 284.03, 990.82);
        quartalssumme(6.42, 4.03, 50.82);
        quartalssumme(936.42, 284.03, 990.82);
        quartalssumme(936.42, 284.03, 990.82);
    }

    private static void quartalssumme(double monat1, double monat2, double monat3) {
        // Berechnung
        double summe = monat1 + monat2 + monat3;
        // Ausgabe
     //   System.out.printf("%n1. Monat:  %14.2f"+"%n2. Monat:  %14.2f"+"%n3. Monat:  %14.2f"+"%nQuartalssumme: %10.2f%n",monat1, monat2, monat3, summe );
        System.out.printf("%n1. Monat:  %14.2f"+"%n2. Monat:  %14.2f"+"%n3. Monat:  %14.2f"+"%nQuartalssumme: %10.2f%n",monat1, monat2, monat3, summe );

    }
}

