package oop.thema1.grundlagen.bank;

public class SparKonto extends Bankkonto {

	protected static double zinsSatz = 0.02;

	// Konstruktor:
	public SparKonto(String kontonummer, double kontostand, Kunde kontoinhaber) {
		super(kontonummer, kontostand, kontoinhaber);
	}

	// Methode berechnet Kontostand nach einem Jahr
	public void zinsenBerechnen() {
		System.out.println("Aktueller Kontostand: " + this.kontostand + " EUR.");
		this.kontostand = this.kontostand * zinsSatz;
		System.out.println("Zinssatz: " + zinsSatz + "\nZinsen nach einem Jahr: " + kontostand);
	}

	@Override
	public String toString() {
		return super.toString() + "\nZinssatz: " + zinsSatz;
	}

}
