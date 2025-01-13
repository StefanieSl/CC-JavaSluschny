package oop.thema1.grundlagen.mathe;

public class MatheHauptProgramm {

	public static void main(String[] args) {

		// Kreisfläche 1. Möglichkeit:
		double radius = 2.3;
		double kreisFlaeche = MatheUtils.PI * radius * radius;
		System.out.println("Fläche: " + kreisFlaeche);
		
		// Kreisfläche 2. Möglichkeit:
		MatheUtils meinMatheUtils = new MatheUtils();
		System.out.println("Fläche: " + meinMatheUtils.kreisFlaeche(2.3));
		
		//Kreisfläche 3. Möglichkeit:
		System.out.println("Fläche: " + MatheUtils.kreisFlaeche2(2.3));

	}

}
