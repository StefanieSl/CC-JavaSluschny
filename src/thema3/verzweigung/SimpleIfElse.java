package thema3.verzweigung;

public class SimpleIfElse {

	public static void main(String[] args) {

		int zahl = 10; 


		if(zahl > 5) { 
			System.out.println("Die Zahl ist größer als 5."); 

		} else if (zahl == 5) { 
			System.out.println("Die Zahl ist genau 5."); 

		} else {
			System.out.println("Die Zahl ist kleiner als 5."); 

		} 

		 
		// mit tenärem Operator: 

		int zahl2 = 10; 

		String ergebnis = (zahl2 > 5) ? "Größer als 5" : "Kleiner oder gleich 5"; 

		System.out.println(ergebnis); 

	}

}
