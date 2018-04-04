package Tag5.SterneFormen;

public class Formen {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();System.out.println();
        int hoehe = 10;
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < hoehe -1 -i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("       ****");
        }

    }

}
