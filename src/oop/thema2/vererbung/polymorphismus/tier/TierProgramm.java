package oop.thema2.vererbung.polymorphismus.tier;

public class TierProgramm {

	public static void main(String[] args) {
		
		Saeugetier hund1 = new Hund("Bello");
		Saeugetier katze1 = new Katze("Minka");
		
		Saeugetier [] saeugetiere = {hund1, katze1};
		
		for (Saeugetier saeugetier : saeugetiere) {
			System.out.println("Name: " + saeugetier.getName());
			saeugetier.macheGeraeusch();
			saeugetier.bewegeDich();
			
			// Prüfen, ob Instanz von Hund oder von Katze:
			if (saeugetier instanceof Hund) {
				((Hund) saeugetier).spiele();
				System.out.println();
			} else if (saeugetier instanceof Katze) {
				((Katze) saeugetier).spiele();
				System.out.println();
			} else {
				System.err.println("Fehler: Keine Instanz von Hund oder Katze!");
			}
		}

	}

}
