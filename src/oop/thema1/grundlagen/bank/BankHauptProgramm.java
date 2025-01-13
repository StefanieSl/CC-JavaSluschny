package oop.thema1.grundlagen.bank;

public class BankHauptProgramm {

	public static void main(String[] args) {

		Bank bank1 = new Bank("Sparkasse", 0);

		Kunde kunde1 = new Kunde("420420", "Spongebob Schwammkopf", "Ananas 1");
		Kunde kunde2 = new Kunde("696969", "Gundula Gause", "Hauptstraße 9000");
		
		Bankkonto konto1 = new Bankkonto("KontoDESpSc56789", 1000, kunde1);
		Bankkonto konto2 = new Bankkonto("KontoDEGuGa12345", 2000, kunde2);
		
		Bank.printBankInfo();
		
		System.out.println("\nKundeninformationen:");
		System.out.println(kunde1);
		System.out.println(kunde2);
		
		System.out.println("\nKontoinformationen:");
		System.out.println(konto1);
		System.out.println(konto2);
	}

}
