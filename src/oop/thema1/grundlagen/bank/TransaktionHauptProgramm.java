package oop.thema1.grundlagen.bank;

public class TransaktionHauptProgramm {
	public static void main(String[] args) {

		Kunde kunde1 = new Kunde("420420", "Spongebob Schwammkopf", "Ananas 1");
		Kunde kunde2 = new Kunde("696969", "Gundula Gause", "Hauptstraße 9000");

		Bankkonto konto1 = new Bankkonto("4204201", 10.28, kunde1);
		Bankkonto konto2 = new Bankkonto("6969691", 50000.50, kunde2);

		Transaktion transaktion1 = new Transaktion(10000001, 4.5, "15.01.2025", konto1, konto2, "Überweisung");

		System.out.println("Spongebob's Kontostand vorher: " + konto1.getKontostand());
		System.out.println("Frau Gause's Kontostand vorher: " + konto2.getKontostand());

		transaktion1.ueberweisung();

		System.out.println("Spongebob's Kontostand nachher: " + konto1.getKontostand());
		System.out.println("Frau Gause's Kontostand nachher: " + konto2.getKontostand());

	}
}
