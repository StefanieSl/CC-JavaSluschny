package oop.thema1.grundlagen.bank;

public class GiroKonto extends Bankkonto {

	private double dispoLimit;

	// Konstruktor:
	public GiroKonto(String kontonummer, double kontostand, Kunde kontoinhaber, double dispoLimit) {
		super(kontonummer, kontostand, kontoinhaber);
		this.dispoLimit = dispoLimit;
	}

	// Methode abheben überschreiben:

	@Override
	public void abheben(double betrag) {
		if (kontostand - betrag >= dispoLimit) {
			System.out.println("Auszahlung über " + betrag + " Euro.");
			this.kontostand -= betrag;
			System.out.println("Neuer Kontostand: " + kontostand + " Euro.");
		} else {
			System.err.println("Fehler: Auszahlung nicht möglich.\nAktueller Kontostand: " + kontostand
					+ "\nDispo-Limit beträgt " + dispoLimit + " EUR.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nDispo-Limit: " + dispoLimit;
	}

	// Getters & Setters:
	public double getDispoLimit() {
		return dispoLimit;
	}

	public void setDispoLimit(double dispoLimit) {
		this.dispoLimit = dispoLimit;
	}

}
