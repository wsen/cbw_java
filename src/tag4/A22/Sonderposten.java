package tag4.A22;

public class Sonderposten extends Artikel {

    private int rabatt;

    public Sonderposten(String artikelNr,
                        double einkaufspreis,
                        int rabatt) {
         super(artikelNr, einkaufspreis);
         this.rabatt = rabatt;
    //
    }

    @Override
    public int berechneVerkaufspreis() {
        return (int)(super.berechneVerkaufspreis() * (1-rabatt / 100.0));
    }

    public String toString(){
        return "Sonderposten:\n"
                + super.toString()  + "\n"
                + "(<alt>: " + super.berechneVerkaufspreis() + "€; Rabatt:" + rabatt + "%)\n";
    }

}
