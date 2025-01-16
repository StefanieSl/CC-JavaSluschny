package oop.thema2.vererbung.polymorphismus.auto;

public class PolymorphismusHauptprogramm {

	public static void main(String[] args) {

		Fahrzeug fahrzeug = new Fahrzeug();
		fahrzeug.starte(); // Fahrzeug.starte() aufgerufen
		fahrzeug = new Auto(); // Jetzt zeigt die Variable auf ein anderes Objekt
		fahrzeug.starte(); // Auto.starte() aufgerufen
		
		fahrzeug = new Motorrad();
		// ((Auto)fahrzeug).klimaanlageEinschalten(); // Downcasting wäre nicht möglich!
	
		// Daher ist if-Schleife nötig, die in dem Fall Fehler ausgibt:
		if (fahrzeug instanceof Auto) {
			Auto auto = (Auto) fahrzeug;
			auto.klimaanlageEinschalten();
		} else {
			System.err.println("Das Fahrzeug ist kein Auto");
		}
	}

}
