package com.ispan.apis;

import java.awt.Color;
import java.util.ArrayList;

public class Line1 implements Line{
	private ArrayList<Point> points;
	private Color color;
	private float width;
	
	public Line1(Color color) {
		points = new ArrayList<>();
		this.color = color;
	}
	
	public void addPoint(int x, int y) {
		points.add(new Point(x, y));
	}
	public int length() {return points.size();}
	
	public int getPointX(int index) {
		return points.get(index).getX();
	}
	public int getPointY(int index) {
		return points.get(index).getY();
	}	
	public Color getColor() {return color;}
	
	
}
