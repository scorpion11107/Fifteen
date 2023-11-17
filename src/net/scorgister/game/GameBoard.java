package net.scorgister.game;

public class GameBoard {
	
	int[][] board = new int[4][4];
	
	GameBoard(){
		
		int value = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				board[i][j] = value;
				value++;
			}
		}
	}
	
	void draw() {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(board[i][j]);
			}
		}
	}
}
