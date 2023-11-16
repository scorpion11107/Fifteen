package net.scorgister.game;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 8678011049000626508L;
	
	public GamePanel() {
		setLayout(new BorderLayout());
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.decode("#505050"));
		
		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(Color.decode("#303030"));
		
		add(BorderLayout.CENTER, mainPanel);
		add(BorderLayout.SOUTH, scorePanel);
	}
}
