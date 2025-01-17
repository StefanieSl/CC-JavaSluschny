package oop.thema3.schnittstellen.tier;

public class Hase implements Tier {

	@Override
	public void laufen() {
		System.out.println("Der Hase läuft.");
		
	}

	@Override
	public void fressen() {
		System.out.println("Der Hase frisst.");
		
	}

}
