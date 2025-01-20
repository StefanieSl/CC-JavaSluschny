package oop.thema4.datenstrukturen.bank;

public class GiroKonto extends Bankkonto implements Ueberziehbar {

	public GiroKonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}

	private static double dispoLimit = -500.0;
	private static double zinsSatz = 0.1;

	@Override
	public void ueberziehungPruefen() {
		if (this.kontostand < 0 && this.kontostand >= dispoLimit) {
			this.kontostand -= (this.kontostand * -1) * zinsSatz;
		} else if (this.kontostand < dispoLimit) {
			
		}
	}

	@Override
	public void abrechnung() {
		ueberziehungPruefen();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Dispo-Limit: " + (dispoLimit * -1) + " EUR.\n";
	}

}
