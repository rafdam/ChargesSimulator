package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import model.ChargesList;

//author:Czajka


public class StationaryQTable extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static DefaultTableModel model;
	static ChargesList StationaryChargesList = new ChargesList();
	
	public StationaryQTable() {
										//Columns names
		 Object[] columns = {"Value[C]*10^(-19)","X","Y","ON/OFF"}; 
		 
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
	
	
	
	
	public static ChargesList GetChargesList(){
		return StationaryChargesList;
	}

	/*
	public StationaryQTable(Vector arg0, Vector<?> arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
*/	// It need some arguments ??	
}
