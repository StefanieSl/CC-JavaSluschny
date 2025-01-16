package oop.thema2.vererbung.monarchie;

public class PrinceCharles extends QueenElizabeth {

	private String firstName = "Charles";

	public void displayFullname() {
		System.out.println("Name: " + firstName + " " + familyName);
	}
}
