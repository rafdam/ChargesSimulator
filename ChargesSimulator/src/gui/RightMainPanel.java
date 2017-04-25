package gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

public class RightMainPanel extends JPanel {

	public RightMainPanel() {
		setLayout(new MigLayout());
		//setBackground(Color.WHITE);
		//setBorder(new LineBorder(Color.BLACK, 5));
		
		MainTabbedPane tabbedPane = new MainTabbedPane();
		add(tabbedPane,"width 100%, height 100%");
		
		
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
