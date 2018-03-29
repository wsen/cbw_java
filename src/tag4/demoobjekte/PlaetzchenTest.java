package tag4.demoobjekte;

public class PlaetzchenTest {

    public static void main(String[] args) {
        Plaetzchen p1 = new Plaetzchen(5);
        Plaetzchen p2 = new Plaetzchen(7);

        p1.verziereMit("Zucherguss");

        String s1 = p1.toString();
        System.out.println(s1);
        String s2 = p2.toString();
        System.out.println(s2);
    }

}

