package oop.thema.grundlagen.monarchie;

public class QueenElizabeth extends Monarch {
	private String responsibility = "Head of State";
	private static int anzahlAutos = 5;

	public void displayResponsibilities() {
		System.out.println("Responsibility: " + responsibility);
	}

	public static int getAnzahlAutos() {
		return anzahlAutos;
	}

	public void setAnzahlAutos(int anzahlAutos) {
		QueenElizabeth.anzahlAutos = anzahlAutos;
	}

}
