package com.ispan.apis;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GiftTable extends JTable {
	private GiftDB db;
	
	public GiftTable() {
		try {
			db = new GiftDB();
			db.queryDB();
		} catch (Exception e) {
			System.out.println(e);
		}
		setModel(new MyModel());
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
			return String.format("Field %d", column);
		}
		
		
		
		
	}

}
