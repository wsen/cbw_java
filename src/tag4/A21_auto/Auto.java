package tag4.A21_auto;

public class Auto {

    private int geschwindigkeit;
    private String farbe;

    public Auto(int geschwindigkeit, String farbe) {
        this.geschwindigkeit = geschwindigkeit;
        this.farbe = farbe;
    }

    public void Tunen() {
        int gplus = this.farbe.length();
        this.geschwindigkeit = this.geschwindigkeit + gplus;

        // -- Bei Nachfolgendem wird nur ein String zurückgegeben aber das Objekt bleibt unverändert.
        //return "Die Brutalo-Wahnsinnskarre läuft jetzt " + String.valueOf(this.geschwindigkeit + gplus) + "kmh. BOAH Ey !!";
        //return this.farbe;
    }

    public String toString() {
        return "Ein Wahnsinnsauto mit der Farbe " + farbe + " und der irren Geschwindigkeit von  " + geschwindigkeit + " km/h";
    }

}
