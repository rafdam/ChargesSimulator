package gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class MotionQPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MotionQPanel() {
		setBounds(800, 350, 350, 250);
		setBackground(Color.blue);
	}

	public MotionQPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MotionQPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MotionQPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
