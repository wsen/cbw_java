package tag5.p2_hangman;
import java.util.Scanner;

public class Hangman {
    private String geheim = "GEHEIM";
    char[] geheimArr = geheim.toCharArray();
    String geheimChar;

    private String eingabe;
    private String s;

    private String ausgabe = "______";
    char[] ausgabeArr = ausgabe.toCharArray();
    String ausgabePrint;


    public Hangman() {
        //this.geheim = geheim;
    }

    public void check() {
        Scanner sc = new Scanner(System.in);
        int richtig = geheimArr.length;


        while (richtig > 0) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(String.valueOf(i) + ". Versuch\n");
                eingabe = sc.nextLine();

                for (int j = 0; j < geheimArr.length; j++) {
                    s = "" + geheimArr[j];
                    if (s.equals(eingabe)) {
                        ausgabeArr[j] = geheimArr[j];
                        richtig--;
                        //System.out.print(richtig);
                    }
                }
                ausgabePrint = new String(ausgabeArr);
                System.out.println(ausgabePrint);

            }
            if (richtig == 0) {
                System.out.println("Hurra gewonnen !");
            } else {
                System.out.println("Leider Verloren !");
            }
            break;
        }
    }
}
