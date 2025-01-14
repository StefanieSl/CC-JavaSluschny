package oop.thema1.grundlagen.bank;

public class SparKonto extends Bankkonto {

	protected static double zinsSatz;

	// Konstruktor:
	public SparKonto(String kontonummer, double kontostand, Kunde kontoinhaber, double zinsSatz) {
		super(kontonummer, kontostand, kontoinhaber);
		SparKonto.zinsSatz = zinsSatz;
	}

	//Methode berechnet Kontostand nach einem Jahr
	public void zinsenBerechnen() {
		System.out.println("Aktueller Kontostand: " + kontostand);
		kontostand = kontostand + kontostand * zinsSatz * 0.01;
		System.out.println("Zinssatz: " + zinsSatz + "\nKontostand nach einem Jahr: " + kontostand);
	}

	@Override
	public String toString() {
		return super.toString() + "\nZinssatz: " + zinsSatz;
	}

}
