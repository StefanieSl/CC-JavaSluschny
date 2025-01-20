package oop.thema4.datenstrukturen.bank;

public abstract class Bankkonto {

	private String kontonummer;
	protected double kontostand;
	
	public Bankkonto(String kontonummer, double kontostand) {
		super();
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}

	public abstract void abrechnung();

	public void einzahlen(double betrag) {
		this.kontostand = this.kontostand + betrag;
	}

	@Override
	public String toString() {
		return "Kontonr. " + this.kontonummer + ",\nKontostand: " + this.kontostand + " EUR,\n";
	}

	public String getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

}
