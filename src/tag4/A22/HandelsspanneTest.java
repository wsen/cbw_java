package tag4.A22;

public class HandelsspanneTest {

    public static void main(String[] args) {
        Artikel a1 = new Artikel("SC123-F", 10.0);
        Artikel a2 = new Artikel("SC347-F", 55.0);

        System.out.println("a1 = " + a1.toString());
        System.out.println("a2 = " + a2.toString());

        Artikel s1 = new Sonderposten("SC123-F", 10.0, 10);
        Sonderposten s2 = new Sonderposten("SC347-F", 55.0, 30);

        System.out.println("s1 = " + s1.toString());
        System.out.println("s2 = " + s2.toString());

        //Array Ausgabe
        Artikel[] artikels = { a1,a2,s1,s2 };
        System.out.println("======= Array === "+ artikels.length + " ===\n");
        for (int i = 0; 0 < artikels.length; i++) {
            System.out.println(artikels[i].toString());
            System.out.println("-----");
        }

    }


}
