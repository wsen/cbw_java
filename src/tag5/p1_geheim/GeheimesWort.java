package tag5.p1_geheim;

import java.util.Scanner;

public class GeheimesWort {
    private String gh = "Hotzenplotz";
    private String eingabe = "";

    public void GeheimesWort() {
        //this.gh = gh;
        //this.eingabe = eingabe;
    }

    public void check() {
        Scanner sc = new Scanner(System.in);
        String line;
        Boolean richtig=false;

        for (int i=1; i<=3; i++) {
            System.out.print(String.valueOf(i) + ". Versuch");
            line = sc.nextLine();
            eingabe = line;
            if(gh.equals(eingabe)) {
                System.out.println("Richtig! /n Gewonnen! /n");
                richtig=true;
                break;
            } else {
                System.out.println("Falscher Fehler!");
            }
        }
        if(!richtig) System.out.println("Leider Verloren !");

    }
}
