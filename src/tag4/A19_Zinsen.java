package tag4;

import java.util.Scanner;

public class A19_Zinsen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Guthaben ?");
        String line = sc.nextLine();
        int guthaben = Integer.parseInt(line);

        System.out.print("Zinssatz ?");
        String line2 = sc.nextLine();
        int zinssatz = Integer.parseInt(line2);


        double kapital1 = vermehren( guthaben, zinssatz);
        System.out.printf("1. Jahr: %.2f %n", kapital1);
        double kapital2 = vermehren(kapital1, zinssatz);
        System.out.printf("2. Jahr: %.2f %n", kapital2);
        double kapital3 = vermehren(kapital2, zinssatz);
        System.out.printf("3. Jahr: %.2f %n", kapital3);
    }

    private static double vermehren(double guthaben, double zinssatz) {
        return guthaben * (1+zinssatz/100);
        // double endkapital = guthaben * (1+zinssatz/100);
        // return endkapital;
    }

}
