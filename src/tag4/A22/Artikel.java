package tag4.A22;

public class Artikel {

    private static final double HANDELSSPANNE=0.6;
    private static final double MWST=0.19;

    private String artikelNr;
    private double einkaufspreis;

    // intelliJ ShortCut: ALT + EINFÜGEN
    public Artikel(String artikelNr, double einkaufspreis) {
        this.artikelNr = artikelNr;
        this.einkaufspreis = einkaufspreis;
    }

    public int berechneVerkaufspreis(){
        return (int) (einkaufspreis * (1+HANDELSSPANNE) * (1+MWST));
    }


    public String toString() {
        return artikelNr
                + " EK: " + einkaufspreis
                + " VK: " + berechneVerkaufspreis() + " €";
    }

}
