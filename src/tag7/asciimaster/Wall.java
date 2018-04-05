package project.asciimaster;

public class Wall extends Field {

    @Override
    public boolean isEnterable() {
        return false;
    }

    @Override
    public char getChar() {
        return '#';
    }

}
