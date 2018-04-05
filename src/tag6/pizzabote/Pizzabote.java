package project.pizzabote;

import java.util.Scanner;

public class Pizzabote {

    private static final String HOME = "C3";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String curCoord = HOME;

        StringBuilder tour = new StringBuilder();

        int sumDistance = 0;
        int number = 1;
        do {
            System.out.print(number + ". Ziel? ");
            String nextCoord = sc.nextLine();
            if (validCoord(nextCoord) && tour.indexOf(nextCoord) < 0) {
                sumDistance += distance(curCoord, nextCoord);
                curCoord = nextCoord;
                tour.append(curCoord);
                System.out.println(tour.toString());
                number++;
            }
        } while (!curCoord.equals(HOME));
        System.out.println("Entfernung: " + sumDistance);
    }

    private static int distance(String from, String to) {
        return Math.abs(row(from) - row(to)) + Math.abs(col(from) - col(to));
    }

    private static boolean validCoord(String coord) {
        if (coord.length() != 2) {
            return false;
        }

        char first = coord.charAt(0);
        if (first < 'A' || first > 'E') {
            return false;
        }

        char second = coord.charAt(1);
        if (second < '1' || second > '5') {
            return false;
        }

        return true;
    }

    private static int col(String coord) {
        return coord.charAt(0)-'A';
    }

    private static int row(String coord) {
        return coord.charAt(1)-'1';
    }

}
