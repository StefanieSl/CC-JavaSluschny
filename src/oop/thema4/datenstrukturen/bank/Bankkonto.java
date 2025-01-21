package oop.thema4.datenstrukturen.bank;

import java.util.Random;

public class Bankkonto {

	protected String kontonummer;
	protected int kontonummerInt;
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
	
	public void randomKonto(int anzahl) {
		
		// Um eine bestimmte "anzahl" Konten zu generieren
		for (int i = 0; i < anzahl; i++) {
			
			// Generiere Zufallsgenerator für Kontoart (Spar/Giro)
			Random randomBool = new Random();
			boolean sparTrue = randomBool.nextBoolean();
			
			if(sparTrue == true) {
				SparKonto spari = new SparKonto(randomKontonr(), randomKontostand());
				System.out.println("Generiertes Konto Nr. " + (i+1) + ": Sparkonto\n" + spari);
			} else {
				GiroKonto giro = new GiroKonto(randomKontonr(), randomKontostand());
				System.out.println("Generiertes Konto Nr. " + (i+1) + ": Girokonto\n" + giro);
			}
		}

	}
	
	public String randomKontonr() {
		Random randomInt = new Random();
		
        // Generiere zufällige Kontonr.
        int randomNr = randomInt.nextInt(1000000);
        // Speichere neue Kontonr. als String in kontonummer
        kontonummer = Integer.toString(randomNr);
        
        return kontonummer;
        
	}
	
	public double randomKontostand() {
		Random randomDouble = new Random();
		
		// Generiere zufälligen Kontostand
        double randomStand = randomDouble.nextDouble(1000.00, 10001.00);
        // Speichere zufälligen Kontostand in kontostand
        kontostand = Math.round(randomStand * 100.0) / 100.0;
        
        return kontostand;
	}

	public void abrechnung() {
	}

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	@Override
	public String toString() {
		return "Kontonr. " + this.kontonummer + ",\nKontostand: " + this.kontostand + " EUR,\n";
	}

}
