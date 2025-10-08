package com.ispan.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.ispan.apis.GamePanel;

public class BallGame extends JFrame{

	public BallGame() {
		
		setLayout(new BorderLayout());
		add(new GamePanel(), BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BallGame();
	}

}
