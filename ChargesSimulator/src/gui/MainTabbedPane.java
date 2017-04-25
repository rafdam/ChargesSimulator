package gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTabbedPane extends JTabbedPane {
	
	
	public MainTabbedPane() {
		TabPanel1 tab1 = new TabPanel1();
		addTab("Charges", tab1);
		
		TabPanel2 tab2 = new TabPanel2();
		addTab("Options", tab2);
		
		TabPanel3 tab3 = new TabPanel3();
		addTab("Help", tab3);
		
		
		
		
	}

	public MainTabbedPane(int arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainTabbedPane(int arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
