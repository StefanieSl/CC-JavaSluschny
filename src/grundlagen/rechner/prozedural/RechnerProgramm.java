package grundlagen.rechner.prozedural;


/**
 * Dieses Programm dient der Erstellung eines einfachen Rechners in Java
 */
public class RechnerProgramm {

	public static void main(String[] args) {
		int zahl1 = 10;
		int zahl2 = 20;
		
		int ergebnis = zahl1 + zahl2;
		
		System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);

		
		int zahl3 = 3;
		int zahl4 = 13;
		
		int ergebnis2 = zahl3 + zahl4;
		
		System.out.println("Addition von " + zahl3 + " und " + zahl4 + " ist " + ergebnis2);
		
		//oder mit dem Aufruf der Funktion von unten:
		addierenUndAusgeben(10, 20);
		addierenUndAusgeben(3, 13);
		
		subtrahierenUndAusgeben(20, 10);
		
		multiplizierenUndAusgeben(7, 5);
		
		dividierenUndAusgeben(50, 0);
	}
	
	public static void addierenUndAusgeben(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ergibt " + ergebnis);
	}

	public static void subtrahierenUndAusgeben(int zahl1, int zahl2) {
		int ergebnis = zahl1 - zahl2;
		System.out.println("Subtraktion " + zahl2 + " von " + zahl1 + " ergibt " + ergebnis);
	}

	public static void multiplizierenUndAusgeben(int zahl1, int zahl2) {
		int ergebnis = zahl1 * zahl2;
		System.out.println("Multiplikation von " + zahl1 + " und " + zahl2 + " ergibt " + ergebnis);
	}
	
	public static void dividierenUndAusgeben(int zahl1, int zahl2) {
		if (zahl2 != 0) {
			int ergebnis = zahl1 / zahl2;
		System.out.println("Division von " + zahl1 + " durch " + zahl2 + " ergibt " + ergebnis);
		}
		else   {
			System.out.println("Dividieren durch Null nicht möglich.");
		}
	}
}
