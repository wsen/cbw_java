package UML.tag2;

public class Horst {
    public static final double MIN = 200.0;
    public static String status = "König";
    private double geldbetrag;
    boolean hunger;
    protected String[] freunde;
    public char[] alphabet;

    public boolean freundeEinladen() {
        return geldbetrag > MIN;
    };

    public Horst() {
        freunde = new String[10];
        alphabet = new char[26];
        hunger = true;
        freunde[0] = new String();
        for (int i = 0; i < 26; i++)
            alphabet[i] = (char) ('a' + i);
    }
}



