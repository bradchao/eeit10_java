package com.ispan.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class GuessGame extends JFrame implements ActionListener{
	private JTextField input;
	private JButton guess;
	
	//private JTextArea log;
	private JTextPane log;
	
	private String answer;
	private int counter;
	private int dig = 4;
	
	public GuessGame() {
		super("猜數字遊戲");
		
		input = new JTextField();
		input.setFont(new Font(null, Font.BOLD, 24));
		input.setForeground(Color.BLUE);
		
		guess = new JButton("猜");
		log = new JTextPane();
		log.setFont(new Font(null, Font.BOLD, 24));
		
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
		//System.out.println(answer);
		log.setText("");
		
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
		for (int i=0; i<dig; i++) sb.append(poker[i]);
		
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
		
		StyledDocument style = log.getStyledDocument();
		
 		Style s0 = style.addStyle("s0", null);
		StyleConstants.setForeground(s0, Color.ORANGE);
		
 		Style s1 = style.addStyle("s1", null);
		StyleConstants.setForeground(s1, Color.RED);
		
 		Style s2 = style.addStyle("s2", null);
		StyleConstants.setForeground(s2, Color.BLACK);
		
 		Style s3 = style.addStyle("s3", null);
		StyleConstants.setForeground(s3, Color.BLUE);
		
		try {
			style.insertString(style.getLength(), String.format("%d. ", counter), s0);
			style.insertString(style.getLength(), g, s1);
			style.insertString(style.getLength(), " => ", s2);
			style.insertString(style.getLength(), result + "\n", s3);
		}catch(Exception ee) {}
		
		//log.append(String.format("%d. %s => %s\n", counter, g, result));
		
		input.setText("");
		
		if (result.equals( dig + "A0B")) {
			JOptionPane.showMessageDialog(null, "WINNER");
			initGame();
		}else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "LOSER:" + answer);
			initGame();
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






