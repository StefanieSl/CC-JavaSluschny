package oop.thema1.grundlagen.bank;

public class Bankkonto {

	private String kontonummer;
	private double kontostand;
	private Kunde kontoinhaber;
	
	// Konstruktor:
	public Bankkonto(String kontonummer, double kontostand, Kunde kontoinhaber) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.kontoinhaber = kontoinhaber;

		// Aufruf aus Bank - Methode zählt Konten ++
		Bank.kontoErstellt();
	}
	
	
	// Methoden:
	
	public void einzahlen(double betrag) {
		System.out.println("Einzahlung über " + betrag + " Euro.");
		this.kontostand = kontostand + betrag;
		System.out.println("Neuer Kontostand: " + kontostand + " Euro.");
	}
	
	public void abheben(double betrag) {
		System.out.println("Auszahlung über " + betrag + " Euro.");
		this.kontostand = kontostand - betrag;
		System.out.println("Neuer Kontostand: " + kontostand + " Euro.");
	}
	
	@Override
	public String toString() {
		return "Konto: " + kontonummer + ", Inhaber: " + kontoinhaber.getNameKD() + ", Kontostand: " + kontostand + " Euro.";
	}
	
	// Getters & Setters: 
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
	
	public Kunde getKontoinhaber() {
		return kontoinhaber;
	}
	public void setKontoinhaber(Kunde nameKD) {
		this.kontoinhaber = nameKD;
	}
}
