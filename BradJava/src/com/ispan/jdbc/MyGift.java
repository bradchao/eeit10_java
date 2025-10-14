package com.ispan.jdbc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.ispan.apis.GiftTable;

public class MyGift extends JFrame{
	private GiftTable table;
	private JButton del;
	
	public MyGift() {
		super("伴手禮");
		
		table = new GiftTable();
		setLayout(new BorderLayout());
		del = new JButton("Delete");
		add(del, BorderLayout.NORTH);
		add(new JScrollPane(table), BorderLayout.CENTER);
		
		
		setSize(1024, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				table.delRow();
			}
		});
	}
	public static void main(String[] args) {
		new MyGift();
	}

}
