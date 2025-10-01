package com.ispan.apis;

import java.awt.Color;
import java.util.ArrayList;

public class Line {
	private ArrayList<Point> points;
	private Color color;
	private float width;
	
	public Line(Color color) {
		points = new ArrayList<>();
		this.color = color;
	}
	
	public void addPoint(int x, int y) {
		points.add(new Point(x, y));
	}
	public int length() {return points.size();}
	
	public Point getPoint(int index) {
		return points.get(index);
	}
	
	public Color getColor() {return color;}
	
	
}
