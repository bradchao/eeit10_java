package com.ispan.apis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanelV2 extends JPanel{
	private Timer timer;
	private int viewW, viewH;
	private BufferedImage[] ballImgs = new BufferedImage[4];
	private int[] ballWs = new int[4];
	private int[] ballHs = new int[4];
	private ArrayList<BallTask> balls;
	private String[] source = {"dir1/ball0.png","dir1/ball1.png","dir1/ball2.png","dir1/ball3.png"};
	
	public GamePanelV2() {
		setBackground(Color.GREEN);
		
		try {
			for (int i=0; i<source.length; i++) {
				ballImgs[i] = ImageIO.read(new File(source[i]));
				ballWs[i] = ballImgs[i].getWidth();
				ballHs[i] = ballImgs[i].getHeight();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		balls = new ArrayList<>();
		
		
		timer = new Timer();
		timer.schedule(new RefreshView(), 0, 16);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BallTask ballTask = new BallTask(e.getX(), e.getY());
				timer.schedule(ballTask, 300, 30);
				balls.add(ballTask);
			}
		});
		
	}
	
	private class BallTask extends TimerTask {
		int ballX, ballY;
		int dx, dy;
		int ballW, ballH;
		int ball;	// 0 ~ 3
		
		BallTask(int ballX, int ballY){
			dx = (int)(Math.random()*17-8);
			dy = (int)(Math.random()*17-8);
			ball = (int)(Math.random()*4);
			ballW = ballWs[ball];ballH = ballHs[ball];
			
			this.ballX = ballX - (int)(ballW / 2.0); 
			this.ballY = ballY - (int)(ballH / 2.0);
		}
		
		@Override
		public void run() {
			if (ballX < 0 || ballX + ballW >= viewW) {
				dx *= -1;
			}
			if (ballY < 0 || ballY + ballH >= viewH) {
				dy *= -1;
			}
			ballX += dx;
			ballY += dy;			
		}
	}
	
	private class RefreshView extends TimerTask {
		@Override
		public void run() {
			repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		
		for (BallTask task :balls) {
			g.drawImage(ballImgs[task.ball], task.ballX, task.ballY, null);
		}
		
		
	}

}
