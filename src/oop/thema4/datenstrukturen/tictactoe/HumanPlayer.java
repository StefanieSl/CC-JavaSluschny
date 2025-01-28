package oop.thema4.datenstrukturen.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	Scanner scanner = new Scanner(System.in);

	public HumanPlayer() {
		super();
		this.name = "Human";
		this.symbol = Symbol.X;
	}

	@Override
	public void makeMove(Board board) {
		try {
			System.out.println("Bitte gib deine Bewegung (Reihe Spalte) ein: 0 0");
			int row = scanner.nextInt() - 1;
			int col = scanner.nextInt() - 1;

			if (row >= 0 && row < GameConfig.boardSize && col >= 0 && col < GameConfig.boardSize) {
				
				if (board.makeMove(row, col, getSymbol()) == false) {
					makeMove(board);
				} else {
					System.out.println();
				}
			} else {
				System.out.println("Ungültige Eingabe. Bitte gib zwei Zahlen von 1 bis 3 ein.");
				scanner.nextLine();
				makeMove(board);
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Ungültige Eingabe. Bitte gib zwei Zahlen von 1 bis 3 ein.");
			scanner.nextLine();
			makeMove(board);
		}

	}

	@Override
	public Symbol getSymbol() {
		return (Symbol) this.symbol;
	}

	@Override
	public boolean isHuman() {
		return true;
	}

}
