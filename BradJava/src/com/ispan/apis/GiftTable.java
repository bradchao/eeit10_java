package com.ispan.apis;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GiftTable extends JTable {
	public GiftTable() {
		setModel(new MyModel());
	}
	
	private class MyModel extends DefaultTableModel {
		
	}

}
