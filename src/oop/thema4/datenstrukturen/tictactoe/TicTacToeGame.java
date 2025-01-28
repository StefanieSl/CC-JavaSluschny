package oop.thema4.datenstrukturen.tictactoe;

public class TicTacToeGame {

	private Board board;
	private HumanPlayer human;
	private ComputerPlayer computer;

	public TicTacToeGame() {
		board = new Board();
		human = new HumanPlayer();
		computer = new ComputerPlayer();
	}

	public void play() {
		board.printBoard();
		
		System.out.println("Spieler: " + human.getSymbol());
		System.out.println("Computer: " + computer.getSymbol());
		
		while(board.isFull()==false) {
			human.makeMove(board);
	
			if (board.isFull()) {
				System.out.println("Unentschieden - leider kein Platz mehr:");
				board.printBoard();
				System.exit(0);
			}
	
			System.out.println("Computer zieht:");
			computer.makeMove(board);
		}
	}

}
