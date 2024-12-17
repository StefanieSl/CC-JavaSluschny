package BMI_Rechner;

import utils.IO;

public class BMI {

	public static void main(String[] args) {
		
		/* 1.3: Zahlen direkt im Programm:
		double groesse = 1.80;
		double gewicht = 80;
		
		double bmi = gewicht / (groesse * groesse);
		
		IO.writeln("Wert =" + bmi);
		
		*/
	
	
		// 1.4: BMI-Rechner mit Eingabefenster:
		
		String name = IO.promptAndReadString("Bitte Namen eingeben: ");
		System.out.println("Huhu " + name + ", lass uns deinen BMI berechnen :)");
		
		double groesse = IO.promptAndReadDouble("Starten wir mit deiner Größe (im Format m.cm)): ");
		System.out.println("Alles klar, du bist " + groesse + " m groß.");
		
		double gewicht = IO.promptAndReadDouble("Jetzt zu deinem Gewicht in Kilogramm: ");
		System.out.println("Danke. Du wiegst " + gewicht + " kg.");
		
		double bmi = gewicht / (groesse * groesse);
		
		System.out.println("Damit beträgt dein BMI: " + bmi);
		
		String wissen = IO.promptAndReadString("Möchtest du wissen, ob du Normalgewicht hast, Tippe 'Y', ansonsten gib einen anderen Buchstaben ein.");
		if (wissen.equals("Y")) {
				if (bmi >= 25) {
					System.out.println("Plus-size Qween! Du bist über dem Normalgewicht.");
				} else if (bmi < 18.5) {
					System.out.println("Du bist unter dem Normalgewicht - gönn dir was geiles von Mäcces!");
				} else
					System.out.println("Yay, du bist im Normalgewicht!");
		} else {
			System.out.println("The less you know, the better.");
		}

	}
	
}
