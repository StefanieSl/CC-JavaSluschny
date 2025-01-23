package oop.thema4.datenstrukturen.tictactoe;

public interface Player {

	Symbol getSymbol(); // gibt Symbol des Spielers zurück
	
	void makeMove(Board board); // führt einen Spielzug aus
	
	boolean isHuman(); // gibt an, ob der Spieler menschlich ist
	
}
