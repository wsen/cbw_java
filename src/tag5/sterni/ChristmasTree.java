package tag5.Baum;

public class ChristmasTree {
    private int baseLength;

    public ChristmasTree(int baseLength) {
        this.baseLength = baseLength;
    }

    public void print() {
        SpacebarLine spacebarLine = new SpacebarLine();
        StarsLine starsLine = new StarsLine();

        for (int i = 1; i <= baseLength; i += 2) {          // obere Teil
            spacebarLine.setLength((baseLength - i) / 2);
            spacebarLine.print();

            starsLine.setLength(i);
            starsLine.print();
            System.out.println();
        }

        for (int j = 0; j < 3; j++) {                        // untere Teil
            spacebarLine.setLength((baseLength / 2) - 1);
            spacebarLine.print();

            starsLine.setLength(3);
            starsLine.print();
            System.out.println();
        }
    }
}
