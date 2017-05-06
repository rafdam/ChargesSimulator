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
		JScrollPane pane = new JScrollPane(table);
		add(table,"width 95%, height 100%");
		add(pane,"width 5%, height 100%");
		
		
		
		
		
		
		
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
