package net.scorgister.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 8678011049000626508L;
	
	int moves;
	JLabel scoreLabel;
	
	public GamePanel() {
		moves = 0;
		
		setLayout(new BorderLayout());

		JPanel mainPanel = new JPanel();
		JPanel infoPanel = new JPanel();
		
		scoreLabel = new JLabel();
		
		mainPanel.setBackground(Color.decode("#505050"));
		
		infoPanel.setBackground(Color.decode("#303030"));
		
		scoreLabel.setForeground(Color.decode("#AAAAAA"));
		scoreLabel.setText("Moves: " + moves);
		
		infoPanel.add(scoreLabel);
		
		add(BorderLayout.CENTER, mainPanel);
		add(BorderLayout.SOUTH, infoPanel);
	}
	
	public void move() {
		moves++;
		scoreLabel.setText("Moves: " + moves);
	}
}
