package oop.thema4.datenstrukturen.bank;

abstract class Bankkonto {

	protected String kontonummer;
	protected double kontostand;

	// Leerer Konstruktor, damit Unterklassen nicht gezwungen sind, den unteren
	// Konstruktor mit allen Parametern zu übernehmen
	public Bankkonto() {

	}

	public Bankkonto(String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;

		InitialisiereKonto(kontonummer, kontostand);
	}

	/**
	 * Zusatz-Methode: Wenn die Kontonummer mit 238 beginnt, wird das Präfix P
	 * (president) hinzugefügt.Wenn die Kontonummer mit 279 beginnt, wird das Präfix
	 * PW (president wife) hinzugefügt. Andernfalls bleibt die Kontonummer
	 * unverändert.
	 */
	private void InitialisiereKonto(String kontonummer, double kontostand) {
		if (kontonummer.startsWith("238")) {
			this.kontonummer = "P" + kontonummer;
		} else if (kontonummer.startsWith("279")) {
			this.kontonummer = "PW" + kontonummer;
		} else {
			this.kontonummer = kontonummer;
		}
		this.kontostand = kontostand;
	}

	public abstract void abrechnung();

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	@Override
	public String toString() {
		return "Kontonr. " + this.kontonummer + ",\nKontostand: " + this.kontostand + " EUR,\n";
	}

}
