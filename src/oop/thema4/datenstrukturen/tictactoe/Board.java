package oop.thema4.datenstrukturen.tictactoe;

public class Board implements GameConfig {

	public Symbol[][] board;

	public Board() {
		board = new Symbol[boardSize][boardSize];
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				board[i][j] = Symbol.LEER;
			}
		}
	}

	// Platziert ein Symbol auf dem Spielfeld
	public boolean makeMove(int row, int col, Symbol symbol) {
		if (board[row][col] == Symbol.LEER && row >= 0 && row < boardSize && col >= 0 && col < boardSize) {
			board[row][col] = symbol;
			
			if (checkWin(Symbol.X)) {
				System.out.println("Du hast gewonnen:");
				printBoard();
				System.exit(0);
			} else if (checkWin (Symbol.O)) {
				System.out.println("Schade, leider verloren:");
				printBoard();
				System.exit(0);
			} 
			
			printBoard();
			return true;
		} else {
			System.out.println("Feld belegt. Neuer Zug:");
			return false;
		}
		
		}
	
	// Überprüft, ob ein Spieler gewonnen hat
	public boolean checkWin(Symbol symbol) {
	    for (int i = 0; i < GameConfig.boardSize; i++) {
	        if (reiheGewinnt(i, symbol) || zeileGewinnt(i, symbol)) {
	            return true;
	        }
	    }
	    // Diagonale Prüfungen
	    return diagonalGewinnt(symbol);
	}
	
	private boolean reiheGewinnt(int row, Symbol symbol) {
	    for (int col = 0; col < GameConfig.boardSize; col++) {
	        if (board[row][col] != symbol) {
	            return false;
	        }
	    }
	    return true;
	}
	
	private boolean zeileGewinnt(int col, Symbol symbol) {
	    for (int row = 0; row < GameConfig.boardSize; row++) {
	        if (board[row][col] != symbol) {
	            return false;
	        }
	    }
	    return true;
	}
	
	private boolean diagonalGewinnt(Symbol symbol) {
	    boolean leftToRight = true, rightToLeft = true;
	    for (int i = 0; i < GameConfig.boardSize; i++) {
	    	// 0-0, 1-1, und 2-2:
	        if (board[i][i] != symbol) leftToRight = false;
	        // 0-2, 1-1 und 2-0:
	        if (board[i][GameConfig.boardSize - i - 1] != symbol) rightToLeft = false;
	    }
	    return leftToRight || rightToLeft;
	}

	// Gibt das Spielfeld in der Konsole aus
	public void printBoard() {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				System.out.print((board[i][j] == Symbol.LEER ? "-" : board[i][j]) + " ");
			}
			System.out.println();
		}
	}


	// Überprüft, ob das Spielfeld voll ist
	public boolean isFull() {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				if (board[i][j] == Symbol.LEER) {
					return false;
				}
			}
		}
		return true;
	}
}
