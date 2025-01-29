package uebungsaufgaben.telefonbuch;

import java.util.ArrayList;

public class Telefonbuch {

	private ArrayList<Kontakt> kontaktliste = new ArrayList<Kontakt>();
	
	public Telefonbuch() {
		
	}
	
	public void kontaktHinzufuegen(String nachname, String vorname, String nummer) {
		kontaktliste.add(new Kontakt(nachname, vorname, nummer));
		System.out.println("Neuer Kontakt: " + nachname + ", " + vorname + ": " + nummer);
	}

	public void printKontaktliste() {
		System.out.println("Kontaktliste: " + kontaktliste);;
	}
	
	public boolean sucheKontakt(String name) {
		for (int i = 0; i < kontaktliste.size(); i++) {
			if (kontaktliste.contains(name)) {
				System.out.println(kontaktliste.get(i));
				return true;
			}
		}
		
		return false;
	}
	
}
