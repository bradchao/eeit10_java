package com.ispan.apis;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<Point> points;
	
	
	public MyDrawer() {
		setBackground(Color.GREEN);
		
		points = new LinkedList<>();
		
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);

	}
	
	public LinkedList getPoints() {
		return points;
	}
	
	private class MyListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			Point p = new Point(e.getX(), e.getY());
			points.add(p);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point p = new Point(e.getX(), e.getY());
			points.add(p);
			repaint();
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		

		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLUE);
		
		for (int i=1; i<points.size(); i++) {
			Point p0 = points.get(i-1);
			Point p1 = points.get(i);
			g2d.drawLine(p0.getX(), p0.getY(), p1.getX(), p1.getY());
		}
		
	}
	
}

