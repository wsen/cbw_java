package tag5.Baum;

public class StarsLine {
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
