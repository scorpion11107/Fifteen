package net.scorgister.game;

import javax.swing.JFrame;

public class MainGame {

	private static JFrame frame;

	public static void main(String[] args) {
		frame = new JFrame("Game of Fifteen");
		frame.setDefaultCloseOperation(3);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		GamePanel pan = new GamePanel();
		frame.setContentPane(pan);
		
		frame.setVisible(true);
	}

}
