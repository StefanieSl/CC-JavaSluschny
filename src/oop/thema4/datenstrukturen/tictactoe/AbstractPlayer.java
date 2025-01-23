package oop.thema4.datenstrukturen.tictactoe;

public abstract class AbstractPlayer implements Player {

	protected String name;
	protected char symbol;
	
	// Konstruktor für die Initialisierung
	public AbstractPlayer (String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	// Gibt das Symbol des Spielers zurück
	@Override
	public Symbol getSymbol() {
		return null;
	}

	// Gibt an, ob der Spieler menschlich ist
	@Override
	public abstract boolean isHuman();

}
