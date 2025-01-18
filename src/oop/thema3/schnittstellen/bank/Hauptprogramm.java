package oop.thema3.schnittstellen.bank;

public class Hauptprogramm {

	public static void main(String[] args) {

		Zinsfaehig spari = new SparKonto("123456", 5300);
		Ueberziehbar giro = new GiroKonto("654321", 1300);

		System.out.println(spari);
		System.out.println(giro);
		
	}

}
