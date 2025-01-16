package oop.thema2.vererbung.polymorphismus.auto;

public class Auto extends Fahrzeug{
	
	@Override
	public void starte() {
		System.out.println("Auto.starte() aufgerufen.");
	}
	
	public void klimaanlageEinschalten() {
		System.out.println("Klimaanlage eingeschaltet.");
	}
}
