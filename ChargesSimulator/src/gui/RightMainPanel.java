package gui;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

//autor:Czajka


public class RightMainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RightMainPanel() {
		setLayout(new MigLayout());
		//setBackground(Color.WHITE);
		//setBorder(new LineBorder(Color.BLACK, 5));
		
		MainTabbedPane tabbedPane = new MainTabbedPane(); //pane with cards" Charges, Help..."
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
