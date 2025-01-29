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
		System.out.println("Kontaktliste: ");
		for (Kontakt kontakt : kontaktliste) {
			System.out.println(kontakt);
		}
	}
	
	public Kontakt sucheKontakt(String name) {
		for (Kontakt kontaktSuche : kontaktliste) {
			// toLowerCase() --> Groß-/Kleinschreibung spielt keine Rolle
			if (kontaktSuche.getNachname().toLowerCase().equals(name) || kontaktSuche.getVorname().toLowerCase().equals(name)) {
				return kontaktSuche;
			}
		} return null;

	}
	
	public void sucheUndzeigeKontakt(String name) {
	    Kontakt gefundenerKontakt = sucheKontakt(name);
	    if (gefundenerKontakt != null) {
	        System.out.println("Gefundener Kontakt: " + gefundenerKontakt);
	    } else {
	        System.out.println("Kein Kontakt gefunden!");
	    }
	}
	
}
