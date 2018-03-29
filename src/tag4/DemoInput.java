package tag4;

import java.util.Scanner;

public class DemoInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zahl? ");
        String line = sc.nextLine();
        System.out.println(line);

        // String in int umwandeln
        int zahl = Integer.parseInt(line);
        System.out.println("int = " + (zahl + 1));

        // int in String umwandeln
        String ausgabe = Integer.toString(zahl);
        System.out.println("String = " + (ausgabe + 1));

    }
}
