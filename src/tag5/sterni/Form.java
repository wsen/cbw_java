package tag5.sterni;

public class Form {
    // IN Max-Anzahl Zeilen, Max-Anzahl Spalten

    private int zeilen;
    private int spalten;
    private int stamm;

    public Form (int zeilen, int spalten) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.stamm = 3;
    }

    public void doRechteck() {
        for( int i=0; i < zeilen; i++) {
            for(int j=0; j < spalten; j++ ) {
                // OUT print
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void doKeil() {
        spalten = zeilen;
        for( int i=0; i < zeilen; i++) {
            for(int j=0; j < spalten; j++ ) {
                // OUT print
                System.out.print("*");
            }
            System.out.println();
            spalten--;
        }
    }

    public void doBaum() {
        int halbBaum = zeilen / 2;
        for ( int i=0; i < zeilen; i++) {
            //Print-Format für jede Zeile vordefinieren
        }
    }


}
