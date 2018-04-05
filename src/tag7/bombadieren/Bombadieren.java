package project.bombadieren;

import java.util.Scanner;

public class Bombadieren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] field = new boolean[5][5];
        int[][] hits = new int[5][5];
        int cntHits = 0;

        for (int bases = 0; bases < 4; ) {
            int row = random(5);
            int col = random(5);
            if (!field[row][col]) {
                field[row][col] = true;
                bases++;
            }
        }

        int bomb = 1;
        boolean gameOver = false;
        while (!gameOver) {
            System.out.print(' ');
            for (int c = 0; c < 5; c++) {
                System.out.print((char) ('A' + c));
            }
            System.out.println();

            for (int r = 0; r < 5; r++) {
                System.out.print((char) ('1' + r));
                for (int c = 0; c < 5; c++) {
                    int hit = hits[r][c];
                    System.out.print(hit > 0 ? 'X' : hit < 0 ? 'O' : ' ');
                }
                System.out.println();
            }

            String nextCoord;
            do {
                System.out.print(bomb + ". Bombe? ");
                nextCoord = sc.nextLine();
            } while (!validCoord(nextCoord));

            int row = row(nextCoord);
            int col = col(nextCoord);

            if (field[row][col]) {
                hits[row][col] = 1;
                field[row][col] = false;
                cntHits++;
                System.out.println("Getroffen!");
            } else {
                hits[row][col] = -1;
                double minDist = Double.MAX_VALUE;
                for (int r = 0; r < 5; r++) {
                    for (int c = 0; c < 5; c++) {
                        if (field[r][c]) {
                            double dist = distance(nextCoord, String.format("%c%c", 'A' + c, '1' + r));
                            if (dist < minDist) {
                                minDist = dist;
                            }
                        }
                    }
                }
                System.out.println("Daneben! Die nächste Basis ist " + minDist + " km entfernt.");
            }

            if (cntHits == 4) {
                System.out.println("Gewonnen!");
                gameOver = true;
            } else if (bomb == 10) {
                System.out.println("Verloren!");
                gameOver = true;
            }

            bomb++;
        }
    }

    private static int random(int n) {
        return (int) (Math.random() * n);
    }

    private static double distance(String from, String to) {
        int dx = col(from) - col(to);
        int dy = row(from) - row(to);
        return Math.sqrt(dx * dx + dy * dy);
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
