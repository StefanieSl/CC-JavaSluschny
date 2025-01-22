package oop.thema4.datenstrukturen.bank;

import java.util.Scanner;

public class Hauptprogramm {

	public static void main(String[] args) {

//		// Mit Interfaces:
//		Zinsfaehig spari = new SparKonto("123456", 5300);
//		Ueberziehbar giro = new GiroKonto("654321", -600);
//
//		System.out.println(spari);
//		System.out.println(giro);
//
//		spari.zinsenBerechnen();
//		giro.ueberziehungPruefen();
//
//		System.out.println("Mit Zinsen: " + spari);
//		System.out.println("Mit Gebühren: " + giro);
//
		// Neue Bank mit neuen Bankkonten manuell erstellen:
//		Bank bank = new Bank();
//
//		SparKonto spari1 = new SparKonto("111111", 3000);
//		GiroKonto giro1 = new GiroKonto("222222", 1500, -500);
//		SparKonto spari2 = new SparKonto("333333", 5300);
//		GiroKonto giro2 = new GiroKonto("444444", -600, -750);
//		
//		bank.kontoHinzufuegen(spari1);
//		bank.kontoHinzufuegen(giro1);
//		bank.kontoHinzufuegen(spari2);
//		bank.kontoHinzufuegen(giro2);
//
//		bank.zeigeAlleKonten();
//
//		bank.kontoEntfernen("111111");
//		bank.kontoEntfernen("333333");
//
//		bank.zeigeAlleKonten();
//
//		bank.getKonto("222222");
//
//		bank.getKonto("999999");
//		
		// Methode randomKonto für eine bestimmte Anzahl zufällig generierter Konten
		// erstellen
//		Bankkonto zufallsKonten = new Bankkonto();
//		
//		zufallsKonten.randomKonto(5);

		Bank bank = new Bank();

		Scanner scanner = new Scanner(System.in);

		String input = "";

		while (!input.equals("99")) {
			System.out.println(
					"Hauptmenü: Geben Sie eine Zahl ein:\n1: Konto hinzufügen\n2: Konto anzeigen\n3: Alle Konten anzeigen\n4: Konto löschen\n99: Beenden des Programms.");

			String auswahl = scanner.nextLine();

			// Konto hinzufügen
			if (auswahl.equals("1")) {
				System.out.println(
						"Konto hinzufügen:\nFür ein neues Girokonto wählen Sie die 1\nFür ein neues Sparkonto wählen Sie die 2");

				String auswahl2 = scanner.nextLine();

				if (auswahl2.equals("1")) {
					System.out.println("Neues Girokonto erstellen:");
					System.out.println("Kontonummer: ");
					String kontonummer = scanner.nextLine();

					// Mit Try-Catch-Methode, um Fehler zu vermeiden, wenn kein boolean eingegeben
					double kontostand = 0;
					boolean validInput = false;

					while (!validInput) {
						try {
							System.out.println("Kontostand: ");
							// Eingabe als String lesen und in Double umwandeln
							kontostand = Double.parseDouble(scanner.nextLine());
							validInput = true; // Eingabe war korrekt, Schleife beenden
						} catch (NumberFormatException e) {
							System.err.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
						}
					}

					GiroKonto giro = new GiroKonto(kontonummer, kontostand);
					bank.kontoHinzufuegen(giro);
					System.out.println("Girokonto hinzugefügt:\n" + giro);

				} else if (auswahl2.equals("2")) {
					System.out.println("Neues Sparkonto erstellen:");
					System.out.println("Kontonummer: ");
					String kontonummer = scanner.nextLine();

					// Mit Try-Catch-Methode, um Fehler zu vermeiden, wenn kein boolean eingegeben
					double kontostand = 0;
					boolean validInput = false;

					while (!validInput) {
						try {
							System.out.println("Kontostand: ");
							// Eingabe als String lesen und in Double umwandeln
							kontostand = Double.parseDouble(scanner.nextLine());
							validInput = true; // Eingabe war korrekt, Schleife beenden
						} catch (NumberFormatException e) {
							System.err.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
						}
					}

					SparKonto giro = new SparKonto(kontonummer, kontostand);
					bank.kontoHinzufuegen(giro);
					System.out.println("Sparkonto hinzugefügt:\n" + giro);

				}

				// Konto anzeigen
			} else if (auswahl.equals("2")) {
				System.out.println("Konto anzeigen:\nGeben Sie hierfür die Kontonr. an: ");
				String auswahl3 = scanner.nextLine();
				bank.getKonto(auswahl3);

				// Alle Konten anzeigen
			} else if (auswahl.equals("3")) {
				bank.zeigeAlleKonten();

				// Konto löschen
			} else if (auswahl.equals("4")) {
				System.out.println("Konto anzeigen:\nGeben Sie hierfür die Kontonr. ein: ");
				String auswahl4 = scanner.nextLine();
				bank.getKonto(auswahl4);

				System.out.println("Konto löschen? Bestätigen Sie, indem Sie die Kontonr. noch einmmal eingeben: ");
				String auswahl5 = scanner.nextLine();
				bank.kontoEntfernen(auswahl5);

			} else {
				break;
			}

		}

		scanner.close();
	}

}
