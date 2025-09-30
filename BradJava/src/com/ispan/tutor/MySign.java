package com.ispan.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ispan.apis.MyDrawer;

public class MySign extends JFrame {
	private MyDrawer myDrawer;
	private JButton clear, undo, redo;
	
	public MySign() {
		super("簽名 App");
		
		setLayout(new BorderLayout());
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		top.add(clear); top.add(undo);top.add(redo);
		
		add(top, BorderLayout.NORTH);
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initEvent();
	}
	
	private void initEvent() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}
	
	public static void main(String[] args) {
		new MySign();
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == clear) {
//			
//		}else if (e.getSource() == undo) {
//			
//		}else if (e.getSource() == redo) {
//			
//		}
//		
//	}

}
