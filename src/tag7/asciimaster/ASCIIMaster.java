package project.asciimaster;

import java.util.Random;
import java.util.Scanner;

public class ASCIIMaster {

    private static final Random RND = new Random(42);

    private static final int ROWS = 7;

    private static final int COLS = 6;

    private static final int GOALS = 3;

    private final Field[][] fields;

    private int playerCol;

    private int playerRow;

    private boolean hasKey;

    private int lastGoal = 0;

    public ASCIIMaster() {
        fields = new Field[ROWS][COLS];

        int wallRow = ROWS / 2;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                boolean wall = r == 0 || c == 0 || r == ROWS-1 || c == COLS-1 || r == wallRow;
                fields[r][c] = wall ? new Wall() : new EmptyField();
            }
        }

        for (int goal = 1; goal <= GOALS; goal++) {
            while (true) {
                int r = RND.nextInt(ROWS);
                int c = RND.nextInt(COLS);
                if (fields[r][c] instanceof EmptyField) {
                    fields[r][c] = new GoalField(goal);
                    break;
                }
            }
        }

        {
            int doorCol = 1 + RND.nextInt(COLS - 2);
            fields[wallRow][doorCol] = new Door();
        }

        hasKey = false;
        while (true) {
            int r = RND.nextInt(wallRow);
            int c = RND.nextInt(COLS);
            if (fields[r][c] instanceof EmptyField) {
                fields[r][c] = new KeyField();
                break;
            }
        }

        do {
            playerRow = RND.nextInt(wallRow);
            playerCol = RND.nextInt(COLS);
        } while (!(fields[playerRow][playerCol] instanceof EmptyField));
    }

    private void run() {
        Scanner sc = new Scanner(System.in);

        boolean gameOver = false;
        while (!gameOver) {
            print();

            int newCol;
            int newRow;

            System.out.print("Kommando? ");
            String line = sc.nextLine();
            switch (line) {
                case "n": case "N":
                    newCol = playerCol;
                    newRow = playerRow - 1;
                    break;
                case "s": case "S":
                    newCol = playerCol;
                    newRow = playerRow + 1;
                    break;
                case "w": case "W":
                    newCol = playerCol - 1;
                    newRow = playerRow;
                    break;
                case "o": case "O":
                    newCol = playerCol + 1;
                    newRow = playerRow;
                    break;
                default:
                    continue;
            }

            {
                Field newField = fields[newRow][newCol];
                if (newField instanceof Door && hasKey) {
                    ((Door) newField).open();
                }

                if (newField.isEnterable()) {
                    playerCol = newCol;
                    playerRow = newRow;
                }
            }

            if (fields[playerRow][playerCol] instanceof KeyField) {
                fields[playerRow][playerCol] = new EmptyField();
                hasKey = true;
            }

            if (fields[playerRow][playerCol] instanceof GoalField) {
                GoalField goalField = (GoalField) fields[playerRow][playerCol];
                if (goalField.getNumber() == lastGoal + 1) {
                    fields[playerRow][playerCol] = new EmptyField();
                    lastGoal = goalField.getNumber();
                    if (lastGoal == GOALS) {
                        System.out.println("Gewonnen!");
                        gameOver = true;
                    }
                }
            }
        }
    }

    private void print() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                char ch;
                if (r == playerRow && c == playerCol) {
                    ch = '@';
                } else {
                    ch = fields[r][c].getChar();
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new ASCIIMaster().run();
    }

}
