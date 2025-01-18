package oop.thema3.schnittstellen.bank;

public abstract class Bankkonto {

	String kontonummer;
	double kontostand;
	
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
		return this.kontonummer + ", " + this.kontostand;
	}

}
