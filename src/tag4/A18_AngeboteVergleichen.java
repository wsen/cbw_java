package tag4;

public class A18_AngeboteVergleichen {

    public static void main(String[] args) {
        angeboteVergleichen(876.17,510.25,778.92);
    }

    private static void angeboteVergleichen(double  a1, double a2, double a3){
        double c = Math.min(a1, Math.min(a2,a3));

        System.out.printf("%n1. Angebot:  %14.2f"+"%n2. Angebot:  %14.2f"+"%n3. Angebot:  %14.2f"+"%nBestes Angebot: %11.2f%n",a1, a2, a3, c );
    }

}
