package gui;

import java.awt.LayoutManager;

import javax.swing.JPanel;

public class RightMainPanel extends JPanel {

	public RightMainPanel() {
		
		
		
		StationaryQPanel stationaryQpanel = new StationaryQPanel(); // Panel for table and buttons with stationary charges
		add(stationaryQpanel);
		
		MotionQPanel motionQpanel = new MotionQPanel(); // Panel for table and buttons with moving charges
		add(motionQpanel);
	}

	public RightMainPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public RightMainPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public RightMainPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
