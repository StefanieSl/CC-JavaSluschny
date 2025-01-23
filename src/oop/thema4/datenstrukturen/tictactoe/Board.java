package oop.thema4.datenstrukturen.tictactoe;

public abstract class Board {

	// Platziert ein Symbol auf dem Spielfeld
	abstract boolean makeMove(int row, int col, Symbol symbol);
	
	// Gibt das Spielfeld in der Konsole aus
	abstract void printBoard();
	
	// Überprüft, ob ein Spieler gewonnen hat
	abstract boolean checkWin(Symbol symbol);
	
	// Überprüft, ob das Spielfeld voll ist
	abstract boolean isFull();
	
}
