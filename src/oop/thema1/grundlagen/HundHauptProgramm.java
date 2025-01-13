package oop.thema1.grundlagen;

public class HundHauptProgramm {

	public static void main(String[] args) {
		
		//Unser Objekt:
		Hund hund1 = new Hund();
		hund1.name = "Ildar";
		System.out.println("Name: " + hund1.name);

		System.out.println("Familienstand vorher: ");
		hund1.familienstand();
		
		hund1.bellen();
		
		// Änderung des Zustands:
		hund1.alter = 2;
		
		// Anschauen des Verhaltens:
		System.out.println("Familienstand nachher: ");
		hund1.familienstand();
		
		// Weiteres Objekt der Klasse "Hund" mit anderem Konstruktor:
		Hund hund2 = new Hund("Bello");
		System.out.println(hund2.name);
		// Eindeutige ID:
		System.out.println(hund2);
		
		hund2.fressen();
		
	}

}
