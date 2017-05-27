package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import model.ChargesList;
import model.TestChargesList;

public class MovingQTable extends JTable{
private static final long serialVersionUID = 1L;
	
	static DefaultTableModel model;
	static TestChargesList MovingChargesList = new TestChargesList();
	
	public MovingQTable() {
		 Object[] columns = {"+/-","X","Y","Z","Vx","Vy","Vz","ON/OFF"}; //Columns names
	     model = new DefaultTableModel(); 
	     model.setColumnIdentifiers(columns);
	     setModel(model);						//Setting default model of table
	     setDefaultEditor(Object.class, null);
	     
	     // Table look //
	     setBackground(Color.LIGHT_GRAY);
	     setForeground(Color.black);
	     Font font = new Font("",1,14);
	     setFont(font);
	     setRowHeight(15);
	}
	
	public static TestChargesList GetQList(){
		return MovingChargesList;
	}

	public MovingQTable(TableModel arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MovingQTable(TableModel arg0, TableColumnModel arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public MovingQTable(int arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
/*
	public StationaryQTable(Vector arg0, Vector<?> arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
*/														// It need some arguments ??
	
	
	public MovingQTable(Object[][] arg0, Object[] arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public MovingQTable(TableModel arg0, TableColumnModel arg1, ListSelectionModel arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	

}


