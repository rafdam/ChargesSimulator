package gui;

import java.awt.LayoutManager;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class TabPanel1 extends JPanel {

	public TabPanel1() {
		setLayout(new MigLayout());
		
		StationaryQPanel stationaryQpanel = new StationaryQPanel(); // table and buttons with stationary charges		
		MotionQPanel motionQpanel = new MotionQPanel(); //  table and buttons with moving charges
		
		add(stationaryQpanel,"width 100%, height 50%, span");		
		add(motionQpanel,"width 100%, height 50%");
	}

	public TabPanel1(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public TabPanel1(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public TabPanel1(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
