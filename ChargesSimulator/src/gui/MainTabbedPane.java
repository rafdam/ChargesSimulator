package gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

//author: Czajka
//Tabbed Panes in main frame

public class MainTabbedPane extends JTabbedPane {	 
	private static final long serialVersionUID = 1L;
	
	JPanel tab1,tab2;	

	public MainTabbedPane() {
		tab1 = new JPanel();		
		addTab("Charges", tab1);	
		
		
		tab2 = new JPanel();	
		addTab("Help", tab2);
		
		
		////// TAB 1 ////////
		
		StationaryQPanel stationaryQpanel = new StationaryQPanel(); // table and buttons with stationary charges		
		MovingQPanel motionQpanel = new MovingQPanel(); //  table and buttons with moving charges
		
		tab1.setLayout(new MigLayout());	
		tab1.add(stationaryQpanel,"width 100%, height 50%, span");		
		tab1.add(motionQpanel,"width 100%, height 50%");
		
		
		
		
		/////  TAB 2   ///////
		
		String help = new String (
				"How to use Charges Simulator:");
		
		JLabel helpLabel = new JLabel(help);		
	
		
		helpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		helpLabel.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 14));
		
		tab2.add(helpLabel,"span");	
		
		
			
	}

	

}
