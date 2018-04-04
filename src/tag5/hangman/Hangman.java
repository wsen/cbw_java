package hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		char[] geheimesWort = "Hund".toUpperCase().toCharArray();
		char[] sichtbaresWort = new char[geheimesWort.length];
		
		for (int i = 0; i < sichtbaresWort.length; i++) {
			sichtbaresWort[i] = '_';
		}
		
		Scanner sc = new Scanner(System.in);
		
		int fehlversuche = 0;
		
		boolean gameOver = false;
		while (!gameOver) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < sichtbaresWort.length; i++) {
				sb.append(sichtbaresWort[i]);
				sb.append(' ');
			}
			System.out.println(sb);
			
			String line = sc.nextLine();
			char ch = line.toUpperCase().charAt(0);
			
			// Any-Pattern
			boolean treffer = false;
			for (int i = 0; i < geheimesWort.length; i++) {
				if (geheimesWort[i] == ch) {
					sichtbaresWort[i] = ch;
					treffer = true;
				}
			}
			
			if (treffer) {
				if (Arrays.equals(sichtbaresWort, geheimesWort)) {
					System.out.println("Gewonnen!");
					gameOver = true;
				}
			} else {
				System.out.println("Der Buchstabe kommt nicht vor!");
				fehlversuche++; // Spiel
				if (fehlversuche >= 7) { // Spiel
					System.out.println("Verloren!");
					gameOver = true;
				}
			}
		}
	}
	
}
