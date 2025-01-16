package oop.thema2.vererbung.polymorphismus.tier;

public abstract class Saeugetier {
	
	String name;
	
	// Konstruktor
	public Saeugetier(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void bewegeDich();
	
	public void macheGeraeusch() {
		
	}
}
