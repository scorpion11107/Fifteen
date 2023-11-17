package net.scorgister.game;

public class MainGame {
	
	static GameBoard board;

	public static void main(String[] args) {
		
		board = new GameBoard();
		
		board.draw();
	}
}
