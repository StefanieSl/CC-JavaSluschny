package oop.thema4.datenstrukturen.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	Scanner scanner = new Scanner(System.in);
	String name;
	public Enum<Symbol> symbol;

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

			if (board.makeMove(row, col, getSymbol()) == false) {
				makeMove(board);
			} else {
				System.out.println();
			}

		} catch (InputMismatchException e) {
			System.out.println("Ungültige Eingabe. Bitte gib zwei Zahlen von 1 bis 3 ein.");
			scanner.nextLine();
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
