package oop.thema2.vererbung.monarchie;

public class Monarch {
	protected String title = "King/Queen";
	protected String familyName = "Windsor";

	public void displayInfo() {
		System.out.println("Title: " + title + ",Family Name: " + familyName);
	}
}
