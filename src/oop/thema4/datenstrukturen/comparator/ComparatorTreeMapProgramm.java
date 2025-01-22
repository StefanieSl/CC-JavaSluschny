package oop.thema4.datenstrukturen.comparator;

import java.util.TreeMap;

public class ComparatorTreeMapProgramm {

	public static void main(String[] args) {
		
		// TreeMap mit benutzerdefinierten Comparatoren (Sortierung zuerst nach Nachname,
		// dann Vorname, dann Alter, dann E-Mail-Adresse)
		TreeMap<Student, String> studentMap = new TreeMap<>(
				new StudentComparatorNachname());
		
				new StudentComparatorVorname(),
				new StudentComparatorAlter(),
				new StudentComparatorEmail());
		
		studentMap.put(new Student("Ben", "Meier", "b.meier@blub.de", 20), "Englisch");
	}

}
