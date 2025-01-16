package oop.thema2.vererbung.polymorphismus.tier;

public class Katze extends Saeugetier {

	public Katze(String name) {
		super(name);
	}
	
	@Override
	public void macheGeraeusch() {
		System.out.println("Miau!");
	}
	
	@Override
	public void bewegeDich() {
		System.out.println("Die Katze schleicht.");
	}
	
	public void spiele() {
		System.out.println("Die Katze spielt mit einem Wollknäuel.");
	}
	

}
