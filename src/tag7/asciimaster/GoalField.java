package project.asciimaster;

public class GoalField extends Field {

    private int number;

    public GoalField(int number) {
        this.number = number;
    }

    @Override
    public char getChar() {
        return (char) ('0' + number);
    }

    public int getNumber() {
        return number;
    }

}
