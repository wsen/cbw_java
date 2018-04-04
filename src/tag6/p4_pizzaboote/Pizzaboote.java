package tag6.p4_pizzaboote;

import java.util.Arrays;

public class Pizzaboote {

    public static void main(String[] args) {

        // Erzeuge Grid mit 'false' als default-Einzelwert.
        char[] zeilen = { '1','2','3','4','5' };
        char[] spalten = { 'A','B','C','D','E' };


        boolean[][] pizzaLocs = new boolean[ zeilen.length ][ spalten.length ];

        //grid-headers
        for(int h=0; h<spalten.length; h++ ){
            System.out.print("     ");
            System.out.print(new String(spalten).charAt(h));
        }
        System.out.println();
        //grid values
        for(int i=0; i<pizzaLocs.length; i++ ){
            System.out.print(new String(zeilen).charAt(i) + " ");
            for (int j=0; j<pizzaLocs[i].length; j++ ){
                System.out.print(pizzaLocs[i][j]+ " ");
            }
            System.out.println();
        }



        int entf  = entfernung("A1","D3");
        System.out.println("Entfernung: " + entf);
        //System.out.println(new String(spalten).indexOf('C'));
    }

    public static int entfernung(String von, String nach) {

        char vx = von.charAt(0);
        char vy = von.charAt(1);
        char nx = nach.charAt(0);
        char ny = nach.charAt(1);

        int dvx = spalte(vx); int dnx = spalte(nx);
        int dvy = zeile(vy); int dny = zeile(ny);

        System.out.println("ypos-n: "+ dny + ", ypos-v: "+ dvy + ", xpos-n: "+ dnx +", xpos-v: "+ dvx);

        int entf = Math.abs(dny-dvy) + Math.abs(dnx - dvx);

        return entf;
    }

    public static int zeile(char koordinate) {
        // System.out.println("zeile: " + koordinate);
        char[] zeilen = {'1', '2', '3', '4', '5'};  //Array of chars
        for (int i = 0; i < zeilen.length; i++) {
            if (zeilen[i] == koordinate) return i;
        }
        return -1;
    }

    public static int spalte(char koordinate) {
        // System.out.println("spalte: " + koordinate);
        char[] spalten = { 'A','B','C','D','E' };
        for (int i = 0; i < spalten.length; i++) {
            //System.out.println("Spalten i: "+ spalten[i] + ", koordinate: "+ koordinate);
            if (spalten[i] == koordinate) return i;
        }
        return -1;
    }

}
