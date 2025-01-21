package oop.thema4.datenstrukturen.bank;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Bankkonto> konten; // zuerst null, daher unten befüllt mit neuer ArrayList

	// Initialisierung, damit es keine Nullpointer Exception gibt, weil sonst
	// konten=0 bei 'konten.add(konto)' --> gibt Fehler
	public Bank() {
		konten = new ArrayList<Bankkonto>();
	}

	public void kontoHinzufuegen(Bankkonto konto) {
		konten.add(konto);
		System.out.println("Konto hinzugefügt:");
		System.out.println(konto);
	}

	public void kontoEntfernen(String kontonummer) {
		// um zu prüfen, ob die Kontonummer gefunden wurde:
		boolean kontoGefunden = false;
		
		for (int i = 0; i < konten.size(); i++) {
			if (konten.get(i).kontonummer.equals(kontonummer)) {
				konten.remove(i);
				System.out.println("Konto mit Kontonr. " + kontonummer + " wurde entfernt.\n");
				kontoGefunden = true;
				break;
			}
		}
		if (!kontoGefunden) {
	        System.out.println("Konto mit Kontonr. " + kontonummer + " wurde nicht gefunden.\n");
		}
	}

	public Bankkonto getKonto(String kontonummer) {
		for (Bankkonto konto : konten) { // alternativ: for (int i = 0; ...) s.o.
			if (konto.kontonummer.equals(kontonummer)) {
				System.out.println("Gefundenes Konto:\n" + konto);
				return konto; // alternativ: System.out.println(konten.get(i));
			} else {
				System.out.println("Konto mit Kontonr. " + kontonummer + " wurde nicht gefunden.");
				return null;
			}
		}
		return null;
	}

	void zeigeAlleKonten() {
		if (konten.isEmpty()) {
			System.out.println("Es gibt keine Konten.");
			return;
		}

		System.out.println("Alle Konten:");
		for (Bankkonto konto : konten) { // alternativ: for (int i = 0; ...) s.o.
			System.out.println(konto); // alternativ: System.out.println(konten.get(i));
		}
	}
}
