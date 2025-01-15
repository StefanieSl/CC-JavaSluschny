package oop.thema1.grundlagen.bank;

import java.text.DecimalFormat;

public class Bankkonto {

	private String kontonummer;
	protected double kontostand;
	protected Kunde kontoinhaber;

	// Konstruktor:
	public Bankkonto(String kontonummer, double kontostand, Kunde kontoinhaber) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.kontoinhaber = kontoinhaber;

	}

	// Basic-Konstruktor:
	public Bankkonto(String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;

	}

	// Methoden:

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	public void einzahlenUndAusgabe(double betrag) {
		System.out.println("Einzahlung über " + betrag + " Euro.");
		this.kontostand += betrag;
		System.out.println("Neuer Kontostand: " + kontostand + " Euro.");
	}

	public boolean abheben(double betrag) {
		if (betrag <= kontostand) {
			System.out.println("Auszahlung über " + betrag + " Euro.");
			this.kontostand -= betrag;
			System.out.println("Neuer Kontostand: " + getKontostand() + " Euro.");
			return true;
		} else {
			System.err.println("Nicht genut Guthaben!");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Konto: " + kontonummer + ", Inhaber: " + kontoinhaber.getNameKD() + ", Kontostand: " + kontostand
				+ " Euro.";
	}

	// Getters & Setters:
	public String getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}

	public double getKontostand() {
		return Math.floor(kontostand * 100) / 100;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public Kunde getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(Kunde nameKD) {
		this.kontoinhaber = nameKD;
	}
}
