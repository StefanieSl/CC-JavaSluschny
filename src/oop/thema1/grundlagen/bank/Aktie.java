package oop.thema1.grundlagen.bank;

public class Aktie {

	private String isin;
	private String unternehmensName;
	private double preis;

	public Aktie(String isin, String unternehmensName, double preis) {
		super();
		this.isin = isin;
		this.unternehmensName = unternehmensName;
		this.preis = preis;
	}

	public void aktualisierePreis(double neuerPreis) {
		this.preis = neuerPreis;
	}

	@Override
	public String toString() {
		return "Aktie [isin=" + isin + ", unternehmensName=" + unternehmensName + ", preis=" + preis + "]";
	}

}
