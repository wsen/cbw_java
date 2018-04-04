package pferderennen;

/**
 * Created by sreinck on 13.10.16.
 */
public class Pferd {

    private String name;

    private double staerke;

    private double quote;

    private int meter;

    public Pferd(String name) {
        this.name = name;
        this.staerke = Math.random() * 10 + 1;
    }

	public String getName() {
		return name;
	}

	public double getStaerke() {
		return staerke;
	}

	public double getQuote() {
		return quote;
	}

	public void berechneQuote(double sumStaerke) {
		quote = sumStaerke / staerke;
	}

	public int lauf() {
        int meter = (int) (100 * Math.random() - quote) / 20 + 1;
        this.meter += meter;
        return this.meter;
	}
	

}
