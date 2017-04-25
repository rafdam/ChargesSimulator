package gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTabbedPane extends JTabbedPane {
	
	
	public MainTabbedPane() {
		JPanel tab1 = new JPanel();
		addTab("Charges", tab1);
		
		JPanel tab2 = new JPanel();
		addTab("Options", tab2);
		
		JPanel tab3 = new JPanel();
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
