package com.ispan.jdbc;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.ispan.apis.GiftTable;

public class MyGift extends JFrame{
	private GiftTable table;
	
	public MyGift() {
		super("伴手禮");
		
		table = new GiftTable();
		setLayout(new BorderLayout());
		add(table, BorderLayout.CENTER);
		
		
		setSize(1024, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyGift();
	}

}
