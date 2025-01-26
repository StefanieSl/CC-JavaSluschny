package oop.thema4.datenstrukturen.tictactoe;

public class TicTacToeProgramm {

	public static void main(String[] args) {

		Board tictactoe = new Board();

		tictactoe.printBoard();

		HumanPlayer human = new HumanPlayer();
		ComputerPlayer computer = new ComputerPlayer();
		
		System.out.println("Spieler: " + human.getSymbol());
		System.out.println("Computer: " + computer.getSymbol());

		while (tictactoe.isFull() == false) {
			human.makeMove(tictactoe);

			if (tictactoe.isFull()) {
				System.out.println("Unentschieden - leider kein Platz mehr:");
				tictactoe.printBoard();
				System.exit(0);
			}

			System.out.println("Computer zieht:");
			computer.makeMove(tictactoe);
		}

	}

}
