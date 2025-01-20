package oop.thema4.datenstrukturen.bank;

import java.util.ArrayList;

public class Bank {

	ArrayList<Bankkonto> konten;

    public Bank() {
        konten = new ArrayList<>();
    }
    
	void kontoHinzufuegen(Bankkonto konto) {
		konten.add(konto);
		System.out.println("Konto hinzugefügt:");
		System.out.println(konto);
	}

	void kontoEntfernen(String kontonummer) {
		for (int i = 0; i < konten.size(); i++) {
			if (konten.get(i).getKontonummer().equals(kontonummer)) {
				konten.remove(i);
				System.out.println("Konto " + kontonummer + " wurde entfernt.");
				return;
			}
		}
		System.out.println("Konto " + kontonummer + " wurde nicht gefunden.");
	}

	Bankkonto getKonto(String kontonummer) {
		for (Bankkonto konto : konten) {
			if (konto.getKontonummer().equals(kontonummer)) {
				System.out.println("Gefundenes Konto:\n" + konto);
				return konto;
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
		for (Bankkonto konto : konten) {
			System.out.println(konto);
		}
	}
}
