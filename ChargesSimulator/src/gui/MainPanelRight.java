package gui;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

//autor:Czajka


public class MainPanelRight extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainPanelRight() {
		setLayout(new MigLayout());
		//setBackground(Color.WHITE);
		//setBorder(new LineBorder(Color.BLACK, 5));
		
		MainTabbedPane tabbedPane = new MainTabbedPane(); //pane with cards" Charges, Help..."
		add(tabbedPane,"width 100%, height 100%");
		
		
	}
}
