package com.ispan.apis;

import java.awt.Color;

public interface Line {
	public void addPoint(int x, int y);
	public int length();
	
	public int getPointX(int index);
	public int getPointY(int index);
	public Color getColor();
}
