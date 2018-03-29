package tag4;

public class Aufgabe15 {

    public static void main(String[] args) {
        StringBuilder aussage = new StringBuilder("to do is to be");
        System.out.println("nietzsche = " + aussage);
        replaceFirst(aussage, "be", "dol");
        replaceFirst(aussage, "do", "be");
        System.out.println("kant      = " + aussage);
        replaceFirst(aussage, "to", "do");
        replaceFirst(aussage, "is", "do");
        replaceFirst(aussage, "to", "be");
        System.out.println("sinatra   = " + aussage);
    }

    private static void replaceFirst(StringBuilder sb, String searched, String replacement) {
        int idx = sb.indexOf(searched);
        sb.delete(idx, idx + searched.length());
        sb.insert(idx, replacement);
    }

}
