package tag6.p4_pizzaboote;

public class Pizzaboote {

    public static void main(String[] args) {

        String hurz = "Schnurz";
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
        //grid
        for(int i=0; i<pizzaLocs.length; i++ ){
            System.out.print(new String(zeilen).charAt(i) + " ");
            for (int j=0; j<pizzaLocs[i].length; j++ ){
                System.out.print(pizzaLocs[i][j]+ " ");
            }
            System.out.println();
        }



        int distanz  = entfernung("A1","A2");
        //System.out.println(new String(spalten).indexOf('C'));
    }

    public static int entfernung(String von, String nach) {
        zeile(von);
        spalte(nach);
        // Berechne Entfernung

        return 42;
    }

    public static int zeile(String da) {
        //seperate String to chars

       // System.out.println(new String(spalten).indexOf('C'));
        //System.out.println(hurz);
        //char[] dxArr = da.toCharArray();
//        spalten.charAt(dxArr[0]);
//        zeilen.charAt(dxArr[1]);

        return 0;
    }

    public static int spalte(String dort) {
        return 0;
    }

}
