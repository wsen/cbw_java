package hangman;

import java.util.Arrays;

public class HangmanGame {

	// Spiel
	private char geheimesWort[]; // alternative Schreibweise
	private char[] sichtbaresWort; // übliche Schreibweise
	
	private int fehlversuche;
	
	public HangmanGame() {
		 // Spiel
		geheimesWort = "Hund".toUpperCase().toCharArray();
		sichtbaresWort = new char[geheimesWort.length];
		for (int i = 0; i < sichtbaresWort.length; i++) {
			sichtbaresWort[i] = '_';
		}
		
		fehlversuche = 0; // Spiel		
	}
	
	public int rateversuch(char ch) {
		// Spiel
		// Any-Pattern
		boolean treffer = false;
		for (int i = 0; i < geheimesWort.length; i++) {
			if (geheimesWort[i] == ch) {
				sichtbaresWort[i] = ch;
				treffer = true;
			}
		}
		
		if (treffer) { // Spiel
			if (Arrays.equals(sichtbaresWort, geheimesWort)) { // Spiel
				return 1; // Gewonnen
			}
		} else {
			fehlversuche++; // Spiel
			if (fehlversuche >= 7) { // Spiel
				return -1; // Verloren
			}
		}
		
		return 0; // Spiel geht weiter
	}

	public char[] getSichtbaresWort() {
		return sichtbaresWort;
	}

	public int getFehlversuche() {
		return fehlversuche;
	}
}
