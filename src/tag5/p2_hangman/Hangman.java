package tag5.p2_hangman;
import java.util.Scanner;

public class Hangman {
    private String geheim = "GEHEIM";
    char[] geheimArr = geheim.toCharArray();
    private String eingabe = "";


    public Hangman() {
        //this.geheim = geheim;
    }

    public void check() {
        Scanner sc = new Scanner(System.in);
        Boolean richtig=false;

        for (int i=1; i<=5; i++) {
            System.out.print(String.valueOf(i) + ". Versuch");
            eingabe = sc.nextLine();
            char[] eingabeArr = eingabe.toCharArray();



/*           if(.equals(eingabe)) {
                System.out.println("Richtig! /n Gewonnen! /n");
                richtig=true;
                break;
            } else {
                System.out.println("Falscher Fehler!");
            }*/
        }
        if(!richtig) System.out.println("Leider Verloren !");
    }
}
