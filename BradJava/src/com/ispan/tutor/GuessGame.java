package com.ispan.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessGame extends JFrame implements ActionListener{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public GuessGame() {
		super("猜數字遊戲");
		
		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		add(log, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGame();
		guess.addActionListener(this);
	}
	
	private void initGame() {
		counter = 0;
		answer = createAnswer();
		System.out.println(answer);
		
	}
	
	private String createAnswer() {
		final int nums = 10;
		int[] poker = new int[nums];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = nums - 1; i > 0; i--) {
			int r = (int)(Math.random()*(i+1));
			// poker[i] <=> poker[r]
			int temp = poker[i];
			poker[i] = poker[r];
			poker[r] = temp;
		}	
		
		StringBuffer sb = new StringBuffer();
		sb.append(poker[0]).append(poker[1]).append(poker[2]);
		
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		new GuessGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		String g = input.getText();
		String result = checkAB(g);
		log.append(String.format("%d. %s => %s\n", counter, g, result));
		input.setText("");
		
		if (result.equals("3A0B")) {
			JOptionPane.showMessageDialog(null, "WINNER");
		}else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "LOSER:" + answer);
		}
		
	}
	
	private String checkAB(String g) {
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++) {
			if (g.charAt(i) == answer.charAt(i)) {
				A++;
			}else if (answer.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}
	
}






