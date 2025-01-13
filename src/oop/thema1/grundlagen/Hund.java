package oop.thema1.grundlagen;

//Definition einer Klasse:
public class Hund {

	String name;
	
	String rasse;
	
	int alter;
	
	String farbe;
	
	String geschlecht;
	
	// Default-Konstruktor:
	Hund() {
		this.name = "unbekannt";
		this.alter = 1;
	}
	// weiterer Konstruktor:
	Hund(String name) {
		super(); //Aufruf des Default-Konstruktors
		this.name = name;
	}
	
	// Verhalten: bellen, ... familienstand:
	public void bellen() {
		System.out.println(name + " bellt.");
	}
	
	public void fressen() {
		System.out.println(name + " frisst.");
	}
	
	public void schlafen() {
		System.out.println(name + " schläft.");
	}
	
	public void familienstand() {
		if (alter > 1.5) {
			System.out.println("verheiratet");
		} else {
			System.out.println("noch ein Kindchen");
		}
	}
}

