package oop.thema4.datenstrukturen.enums;

public class EnumHauptprogramm {

	public static void main(String[] args) {

		Wochentag tag = Wochentag.DONNERSTAG;
		
		// Enum mit switch-case verwenden
		switch(tag) {
		case MONTAG:
			System.out.println("Wochenstart! Zeit für Arbeit.");
			break;
		case FREITAG:
			System.out.println("Bald Wochenende!");
			break;
		case SAMSTAG:
			System.out.println("Juhu, Wochenende!");
		case SONNTAG:
			System.out.println("Ruhetag.");
			break;
		default:
			System.out.println("Ein normaler Arbeitstag.");
		}
	}

}
