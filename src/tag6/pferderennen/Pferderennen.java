package pferderennen;

import java.util.Scanner;

/**
 * Created by sreinck on 13.10.16.
 */
public class Pferderennen {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        String[] namen = {
                 "Joe Law",
                 "L. B. J.",
                 "Herr Washburn",
                 "Frl. Karen",
                 "Fröhlich",
                 "Pferd Nr. 6",
                 "Versteife nicht",
                 "Mitternacht",
        };
        
        // -w- (Größe des) Array definieren
        Pferd[] pferde = new Pferd[namen.length];

        // -w- Startsumme eines Spielers
        double geld = 1000;

        while (true) {
            // Stärke für jedes Pferd festlegen
            // -w- alle Pferde des Arrays erzeugen
            for (int i = 0; i < pferde.length; i++) {
                pferde[i] = new Pferd(namen[i]);
            }

            // Summe der Stärken berechnen
            // -w- eigentlich hier Stärke der Pferde festlegen und die, aller Pferde aufsummieren
            double sumStaerke = 0;
            for (int i = 0; i < pferde.length; i++) {
                sumStaerke += pferde[i].getStaerke();
            }

            // Quote für jedes Pferd berechnen
            for (int i = 0; i < pferde.length; i++) {
            	pferde[i].berechneQuote(sumStaerke);
            }

            // Pferde mit Quote ausgeben
            for (int i = 0; i < pferde.length; i++) {
                System.out.printf("%d) %s (1:%.3f)%n", i + 1, pferde[i].getName(), pferde[i].getQuote());
            }

            System.out.printf("Wieviel (von %.2f) möchten Sie wetten (ganzzahlig)? ", geld);
            int betrag = Integer.parseInt(sc.nextLine());
            if (betrag <= 0) {
                break;
            }
            System.out.print("Auf wen möchten Sie wetten? ");
            int wette = Integer.parseInt(sc.nextLine()) - 1;

            geld -= betrag;

            int sieger = -1;
            while (sieger < 0) {
                for (int i = 0; i < pferde.length; i++) {
                	if (pferde[i].lauf() >= 1000) {
                        sieger = i;
                    }
                }
            }

            System.out.printf("Sieger ist %s mit der Nummer %d%n", pferde[sieger].getName(), sieger + 1);

            if (wette == sieger) {
                geld += betrag * pferde[sieger].getQuote();
                System.out.printf("... und WAU, Sie haben einen Gewinn von %.2f%n", betrag * pferde[sieger].getQuote());
            }
        }

    }

}
