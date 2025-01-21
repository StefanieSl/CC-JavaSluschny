package oop.thema4.datenstrukturen.bank;

public class SparKonto extends Bankkonto implements Zinsfaehig {

	public SparKonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}

	private final double zinssatz = 0.02;

	@Override
	public void zinsenBerechnen() {
		this.kontostand += this.kontostand * zinssatz;
	}

	@Override
	public void abrechnung() {
		zinsenBerechnen();
	}

	@Override
	public String toString() {
		return super.toString() + "Zinssatz: " + (zinssatz * 100) + " %.\n";
	}
}
