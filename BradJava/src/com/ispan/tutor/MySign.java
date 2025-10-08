package com.ispan.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.ispan.apis.MyClock;
import com.ispan.apis.MyDrawer;

public class MySign extends JFrame {
	private MyDrawer myDrawer;
	private JButton clear, undo, redo, color, save, load, saveJpeg;
	
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
		saveJpeg = new JButton("JPEG");
		top.add(clear); top.add(undo);top.add(redo);top.add(color);
		top.add(save); top.add(load); top.add(saveJpeg);
		top.add(new MyClock());
		
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
				save();
			}
		});
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});
		saveJpeg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveJpeg();
			}
		});

	}
	
	protected void saveJpeg() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			try {
				if (myDrawer.saveJpeg(file)) {
					JOptionPane.showMessageDialog(this, "Save Success");	
				}else {
					JOptionPane.showMessageDialog(this, "Save Failure(1)");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Save Failure(2)");
			}
		}
		
	}

	private void save() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			try {
				myDrawer.saveLines(file);
				JOptionPane.showMessageDialog(this, "Save Success");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Save Failure");
			}
		}
	}
	
	private void load() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			try {
				myDrawer.loadLines(file);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Load Failure");
			}
		}
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
