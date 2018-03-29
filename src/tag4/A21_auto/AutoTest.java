package tag4.A21_auto;

public class AutoTest {

    public static void main(String[] args) {
        Auto p1 = new Auto( 220,"schwarz");
        Auto p2 = new Auto(200, "grün");

        String s1 = p1.toString();
        System.out.println(s1);

        String s2 = p2.toString();
        System.out.println(s2);

        // Tunen
        p1.Tunen();
        System.out.println(p1);

        p2.Tunen();
        System.out.println(p2);
    }

}
