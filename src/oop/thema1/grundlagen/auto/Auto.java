package oop.thema1.grundlagen.auto;

public class Auto {
	
	// Klassenattribut/Klassenvariable - gilt für alle Autos!
	public final static int ANZAHL_REIFEN = 4;
	
	// Objekteigenschaften/-attribute:
	private String marke;
	private String modell;
	private int baujahr;
	
	// Default-Konstruktor:
	public Auto() {
		marke = "unbekannt";
		modell = "unbekannt";
		baujahr = 0;
	}
	
	public Auto(String marke, String modell, int baujahr) {
		super();
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}
	
	//Objektmethode:
	public void fahren() {
		System.out.println(marke + " " + modell + " fährt.");
	}
	
	// Klassenmethode
	public static void info() {
		System.out.println("Standard Auto mit " + ANZAHL_REIFEN + " Reifen");
	}
	
	// Methode, die benötigt wird, um in anderem Programm auf die 'private' Marke zuzugreifen:
	public String getMarke() {
		return this.marke;
	}
	
	//.. und um sie ändern zu können:
	public void setMarke(String marke) {
		this.marke = marke;
	}

	@Override
	public String toString() {
		return "Auto: Marke " + marke + ", Modell " + modell + ", Baujahr " + baujahr;
	}
}
