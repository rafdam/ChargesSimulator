package gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

public class StationaryQPanel extends JPanel {

	public StationaryQPanel() {
		setLayout(new MigLayout());
		setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.BLACK, 3));		
		
	}

	public StationaryQPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public StationaryQPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public StationaryQPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
