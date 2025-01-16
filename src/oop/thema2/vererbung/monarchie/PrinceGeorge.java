package oop.thema2.vererbung.monarchie;

public class PrinceGeorge extends PrinceWilliam {

	private int anzahlFliegendeAutos = 9;
	private int anzahlAutosGesamt;

	public void displayAutos() {
		anzahlAutosGesamt = anzahlFliegendeAutos + QueenElizabeth.getAnzahlAutos();
		System.out.println("Anzahl Autos: " + anzahlAutosGesamt);
	}

}
