package geheim;

import java.util.Scanner;

public class GeheimesWort {
	
	public static void main(String[] args) {
		String geheimesWort = "geheim";
		
		Scanner sc = new Scanner(System.in);
		
		int versuch = 1;
		boolean gameOver = false;
		while (!gameOver) {
			System.out.print(versuch + ". Versuch? ");
			String line = sc.nextLine();
			
			if (line.equalsIgnoreCase(geheimesWort)) {
				System.out.println("Gewonnen!");
				gameOver = true;
			} else if (versuch < 3) {
				System.out.println("Falsch!");
				versuch++;
			} else {
				System.out.println("Verloren!");
				gameOver = true;
			}
		}
		
	}

}
