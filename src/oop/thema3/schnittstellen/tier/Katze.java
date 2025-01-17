package oop.thema3.schnittstellen.tier;

public class Katze implements Tier {

	@Override
	public void laufen() {
		System.out.println("Die Katze läuft.");
		
	}

	@Override
	public void fressen() {
		System.out.println("Die Katze frisst.");
		
	}

	public void putzen() {
		System.out.println("Die Katze putzt sich.");
	}
	
	public void klettern() {
		System.out.println("Die Katze klettert.");
	}
	
}