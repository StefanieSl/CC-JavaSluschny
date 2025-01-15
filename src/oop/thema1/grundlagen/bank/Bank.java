package oop.thema1.grundlagen.bank;

public class Bank {

	private String nameBK;
	private int anzahlKonten = 2;

	// Konstruktor:
	public Bank(String nameBK) {
		this.nameBK = nameBK;
	}

	public void printBankInfo() {
		System.out.println("Name der Bank: " + this.nameBK);
		System.out.println("Anzahl der Konten: " + this.anzahlKonten);
	}

	// Getters & Setters
	public String getNameBK() {
		return this.nameBK;
	}

	public void setNameBK(String nameBK) {
		this.nameBK = nameBK;
	}

	public int getAnzahlKonten() {
		return this.anzahlKonten;
	}

	public void setAnzahlKonten(int anzahlKonten) {
		this.anzahlKonten = anzahlKonten;
	}

}
