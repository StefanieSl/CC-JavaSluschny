package oop.thema3.schnittstellen.bank;

public class SparKonto extends Bankkonto implements Zinsfaehig {

	public SparKonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}

	private static double zinssatz = 0.02;

	@Override
	public void zinsenBerechnen() {
		this.kontostand += this.kontostand * zinssatz;
	}

	@Override
	public void abrechnung() {
		zinsenBerechnen();
	}

}
