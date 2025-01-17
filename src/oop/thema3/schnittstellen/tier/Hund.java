package oop.thema3.schnittstellen.tier;

public class Hund implements Tier {

	@Override
	public void laufen() {
		System.out.println("Der Hund läuft.");

	}

	@Override
	public void fressen() {
		System.out.println("Der Hund frisst.");

	}
	
	public void bellen() {
		System.out.println("Der Hund bellt.");
	}
	
	public void ballJagen() {
		System.out.println("Der Hund jagt den Ball.");
	}

}
