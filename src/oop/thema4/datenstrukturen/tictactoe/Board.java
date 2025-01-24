package oop.thema4.datenstrukturen.tictactoe;

public class Board {

	private Symbol[][] spielfeld;

	public Board() {

	}

	// Platziert ein Symbol auf dem Spielfeld
	public boolean makeMove(int row, int col, Symbol symbol) {
		return false;
	}

	// Gibt das Spielfeld in der Konsole aus
	public void printBoard() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				System.out.print(spielfeld[i][j] + " ");
			}
			System.out.println(); // Zeilenumbruch nach 3
		}
	}

	// Überprüft, ob ein Spieler gewonnen hat
	public boolean checkWin(Symbol symbol) {
		return false;
	}

	// Überprüft, ob das Spielfeld voll ist
	public boolean isFull() {
		return false;
	}

}
