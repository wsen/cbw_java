package project.asciimaster;

public class Door extends Field {

    private boolean open = false;

    public void open() {
        open = true;
    }

    @Override
    public boolean isEnterable() {
        return open;
    }

    @Override
    public char getChar() {
        return open ? 'O' : 'G';
    }

}
