package com.ispan.tutor;

import javax.swing.JFrame;

public class GuessGame extends JFrame{
	
	public GuessGame() {
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GuessGame();
	}
}
