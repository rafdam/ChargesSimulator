package gui;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

public class StationaryQInPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static StationaryQTable table;
	
	
	public StationaryQInPanel() {
		setLayout(new MigLayout("", "[] []","[]"));
		table = new StationaryQTable();	
		add(table);
		// NOT WORKING @@@
		int tableWidth = table.getWidth();
		System.out.println(tableWidth);
		 double column0w = tableWidth * 0.1; 
		 double column1w = tableWidth * 0.4; 
		 double column2w = tableWidth * 0.1; 
		 double column3w = tableWidth * 0.1; 
		 double column4w = tableWidth * 0.1; 
		 double column5w = tableWidth * 0.2; 
		 table.getColumnModel().getColumn(0).setWidth((int) column0w);
		 table.getColumnModel().getColumn(1).setWidth((int) column1w);
		 table.getColumnModel().getColumn(2).setWidth((int) column2w);
		 table.getColumnModel().getColumn(3).setWidth((int) column3w);
		 table.getColumnModel().getColumn(4).setWidth((int) column4w);
		 table.getColumnModel().getColumn(5).setWidth((int) column5w);		
		
		JScrollPane pane = new JScrollPane(table);
		add(pane);
		
		
		
		
		
		
		
	}

	public StationaryQInPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public StationaryQInPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public StationaryQInPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
