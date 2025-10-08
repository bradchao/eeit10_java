package com.ispan.tutor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.ispan.apis.MyClock;

public class RacingGame extends JFrame{
	private JButton go;
	private JLabel[] lanes;
	private Car[] cars;
	private int rank;
	
	public RacingGame() {
		super("Racing");
		
		setLayout(new GridLayout(10, 1));
		add(new MyClock());
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
		go.setEnabled(false);
		cars = new Car[8];
		for (int i=0; i<cars.length; i++) {
			cars[i] = new Car(i);
		}
		
		for (Car car: cars) {
			car.start();
		}
		
		
	}
	
	private class Car extends Thread {
		private int lane;
		private StringBuffer sb;
		Car(int lane){
			this.lane = lane;
			sb = new StringBuffer(String.format("%d. ", (lane+1)));
		}
		@Override
		public void run() {
			for (int i =0; i<100; i++) {
				if (i == 99) {
					sb.append("> WINNER");
					stopGame();
				}else {
					sb.append(">");
				}
				lanes[lane].setText(sb.toString());
				try {
					Thread.sleep(10 + (int)(Math.random()*200));
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	private void stopGame() {
		for (Car car: cars) {
			car.interrupt();
		}		
		go.setEnabled(true);
	}
	
	
	public static void main(String[] args) {
		new RacingGame();
	}

}
