package oop.thema2.vererbung.polymorphismus.tier;

public class Hund extends Saeugetier {

	//Konstruktor:
	public Hund(String name) {
		super(name);
	}

	@Override
	public void bewegeDich() {
		System.out.println("Der Hund läuft.");
	}
	
	@Override
	public void macheGeraeusch() {
		System.out.println("Wuff!");
	}
	
	public void spiele() {
		System.out.println("Der Hund spielt mit einem Ball.");
	}
}
