package oop.thema2.vererbung.monarchie;

public class RoyalFamilyProgramm {

	public static void main(String[] args) {

		// Objekt von Prince George erstellen:
		PrinceGeorge george = new PrinceGeorge();

		// Methoden aufrufen:
		// Von der Superklasse "Monarch":
		george.displayInfo();

		// Von der Subklasse "QueenElizabeth":
		george.displayResponsibilities();

		// Von der Subklasse PrinceCharles:
		george.displayFullname();

		// Von der Subklasse PrinceWilliam:
		george.displayGeneration();

		// Von der Subklasse PrinceGeorge:
		george.displayAutos();

	}

}
