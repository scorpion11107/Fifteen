package net.scorgister.game;

import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 8678011049000626508L;
	
	public GamePanel() {
		setBackground(Color.DARK_GRAY);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setSize(50, 50);
		mainPanel.setBackground(Color.RED);
		
		JPanel scorePanel = new JPanel();
		scorePanel.setSize(50,  50);
		scorePanel.setBackground(Color.BLUE);
		
		add(mainPanel);
		add(scorePanel);
	}
}
