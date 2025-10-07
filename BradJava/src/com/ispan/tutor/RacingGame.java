package com.ispan.tutor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RacingGame extends JFrame{
	private JButton go;
	private JLabel[] lanes;
	
	public RacingGame() {
		super("Racing");
		
		setLayout(new GridLayout(9, 1));
		go = new JButton("Go!"); add(go);
		
		lanes = new JLabel[8];
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel(String.format("%d. ", (i+1)));
			add(lanes[i]);
		}
		
		setSize(1024, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
	}
	
	
	private void go() {
	}
	
	public static void main(String[] args) {
		new RacingGame();
	}

}
