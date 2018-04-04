package hangman;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class HangmanSwing extends JFrame implements ActionListener {
	
	// GUI
	private JLabel labelBuchstabe = new JLabel("Buchstabe:");
	private JTextField textBuchstabe = new JTextField(1);
	private JButton buttonRate = new JButton("Rate");
	
	private JLabel labelWort = new JLabel("Wort:");
	private JTextField textWort = new JTextField(15);
	
	private JLabel labelFehlversuche = new JLabel();
	
	// Spiel
	private HangmanGame game;
	
	public HangmanSwing() {
		// GUI
		super("Hangman");
		// <--- hier werden die Initailisierungen ausgeführt
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setLayout(new FlowLayout());
		
		textBuchstabe.addActionListener(this);
		buttonRate.addActionListener(this);
		
		add(labelBuchstabe);
		add(textBuchstabe);
		add(buttonRate);
		
		add(labelWort);
		add(textWort);
		add(labelFehlversuche);
		
		// Spiel
		game = new HangmanGame();
		
		update(); // S&G
	}
	
	private void update() {
		// S&G
		textWort.setText(new String(game.getSichtbaresWort()));
		labelFehlversuche.setText("Fehlversuche: " + game.getFehlversuche());
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		String eingabe = textBuchstabe.getText(); // S&G
		textBuchstabe.setText(""); // S&G
		if (eingabe.length() != 1) { // S&G
			return;
		}
		char ch = Character.toUpperCase(eingabe.charAt(0)); // S&G
		
		int ergebnis = game.rateversuch(ch); // Spiel
		
		if (ergebnis == 1) {
			getContentPane().setBackground(Color.GREEN); // S&G
		} else if (ergebnis == -1) {
			System.exit(0); // S&G
		}
		
		update(); // S&G
	}

	public static void main(String[] args) {
		HangmanSwing hangman = new HangmanSwing(); // GUI
		hangman.setVisible(true); // GUI
	}

}
