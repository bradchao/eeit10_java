package com.ispan.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ispan.apis.MyDrawer;

public class MySign extends JFrame {
	private MyDrawer myDrawer;
	private JButton clear, undo, redo, color, save, load;
	
	public MySign() {
		super("簽名 App");
		
		setLayout(new BorderLayout());
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		color = new JButton("顏色");
		save = new JButton("序列化");
		load = new JButton("解序列");
		top.add(clear); top.add(undo);top.add(redo);top.add(color);
		top.add(save); top.add(load);
		
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
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(null, "變更顏色", myDrawer.getDefaultColor());
		if (newColor != null) {
			myDrawer.setDefaultColor(newColor);
		}
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
