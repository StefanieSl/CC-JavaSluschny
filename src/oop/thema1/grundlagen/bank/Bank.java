package oop.thema1.grundlagen.bank;

public class Bank {

	private static String nameBK;
	private static int anzahlKonten = 0;

	// Konstruktor:
	public Bank(String nameBK) {
		Bank.nameBK = "unbekannt";
	}

	public static void printBankInfo() {
		System.out.println("Name der Bank: " + nameBK);
		System.out.println("Anzahl der Konten: " + anzahlKonten);
	}

	// Methode, um die Anzahl der Konten zu erhöhen:
	public static void kontoErstellt() {
		anzahlKonten++;
	}

	// Getters & Setters
	public static String getNameBK() {
		return nameBK;
	}

	public static void setNameBK(String nameBK) {
		Bank.nameBK = nameBK;
	}

	public static int getAnzahlKonten() {
		return anzahlKonten;
	}

	public static void setAnzahlKonten(int anzahlKonten) {
		Bank.anzahlKonten = anzahlKonten;
	}

}
