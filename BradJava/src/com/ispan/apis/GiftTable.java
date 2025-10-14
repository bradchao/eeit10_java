package com.ispan.apis;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GiftTable extends JTable {
	private GiftDB db;
	
	public GiftTable() {
		try {
			db = new GiftDB();
		} catch (Exception e) {
			System.out.println(e);
		}
		setModel(new MyModel());
		
	}
	
	public void delRow() {
		//System.out.println(getSelectedRow()) ;
		int delNum = getSelectedRow();
		if (delNum >= 0) {
			db.delData(delNum);
			repaint();
		}
	}
	
	
	private class MyModel extends DefaultTableModel {

		@Override
		public int getRowCount() {
			try {
				return db.getRows();
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}

		@Override
		public int getColumnCount() {
			return db.getCols();
		}

		@Override
		public Object getValueAt(int row, int column) {
			// row, col => 0-base
			return db.getData(row, column);
		}

		@Override
		public String getColumnName(int column) {
			return db.getColName(column);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return column > 0;
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			try {
				db.setData(aValue, row, column);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
		}
	}

}
