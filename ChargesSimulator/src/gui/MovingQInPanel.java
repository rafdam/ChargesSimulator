package gui;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

//author:Czajka 
//Panel contain table of moving charges

public class MovingQInPanel extends JPanel {

	/**
	 * 
	 */
static MovingQTable table;
	
	
	public MovingQInPanel() {
		setLayout(new MigLayout("", "[] []","[]"));
		table = new MovingQTable();	
		add(table);
		
		// NOT WORKING @@@ trying to set column width (now they are random) //
		/*
		int tableWidth = table.getWidth();
		System.out.println(tableWidth);
		 double column0w = tableWidth * 0.1; 
		 double column1w = tableWidth * 0.4; 
		 double column2w = tableWidth * 0.1; 
		 double column3w = tableWidth * 0.1; 
		 double column4w = tableWidth * 0.1; 
		 
		 table.getColumnModel().getColumn(0).setWidth((int) column0w);
		 table.getColumnModel().getColumn(1).setWidth((int) column1w);
		 table.getColumnModel().getColumn(2).setWidth((int) column2w);
		 table.getColumnModel().getColumn(3).setWidth((int) column3w);
		 table.getColumnModel().getColumn(4).setWidth((int) column4w);
		 */	
		
		JScrollPane pane = new JScrollPane(table);  // Scroll for table of charges
		add(pane);	
	}
	private static final long serialVersionUID = 1L;

	

	public MovingQInPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MovingQInPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MovingQInPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
