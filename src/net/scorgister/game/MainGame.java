package net.scorgister.game;

import javax.swing.JFrame;

public class MainGame {

	public static void main(String[] args) {
		JFrame frame = init("Game of Fifteen");
		
		GamePanel pan = new GamePanel();
		frame.setContentPane(pan);
		
		frame.setVisible(true);
	}

	
	private static JFrame init(String title) {
		JFrame frame = new JFrame(title);
		
		frame.setDefaultCloseOperation(3);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		return frame;
	}
}
