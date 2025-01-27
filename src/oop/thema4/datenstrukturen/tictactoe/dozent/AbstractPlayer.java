package oop.thema4.datenstrukturen.tictactoe.dozent;

public abstract class AbstractPlayer implements Player {

	protected String name;
	protected Symbol symbol;
	
	// Konstruktor für die Initialisierung
	public AbstractPlayer (String name, Symbol symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	// Gibt an, ob der Spieler menschlich ist
	@Override
	public abstract boolean isHuman();

	// Gibt Symbol und Namen des Spielers zurück
	@Override
	public Symbol getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
//	Wir nicht unbeding benötigt, da Name über den Konstruktor schon gesetzt
//	public void setName(String name) {
//		this.name = name;
//	}
}
