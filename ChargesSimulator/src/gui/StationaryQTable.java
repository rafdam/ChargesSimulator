package gui;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class StationaryQTable extends JTable {

	public StationaryQTable() {
		 Object[] columns = {"No","Charge","Value","Coord.","ON/OFF"}; //Columns names
	     DefaultTableModel model = new DefaultTableModel(); 
	     model.setColumnIdentifiers(columns);
	     setModel(model);											//Setting default model of table
	     
	     //Table look
	     setBackground(Color.LIGHT_GRAY);
	     setForeground(Color.black);
	     Font font = new Font("",1,22);
	     setFont(font);
	     setRowHeight(30);
		
	  // create JScrollPane
	   
	   
		
		
		
	}

	public StationaryQTable(TableModel arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQTable(TableModel arg0, TableColumnModel arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StationaryQTable(int arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StationaryQTable(Vector arg0, Vector arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StationaryQTable(Object[][] arg0, Object[] arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StationaryQTable(TableModel arg0, TableColumnModel arg1, ListSelectionModel arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
