package gui;
import java.awt.Dimension;
//author: Mikolaj Czajka
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

//import com.sun.javafx.tk.Toolkit;
//import com.sun.prism.paint.Color;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() throws HeadlessException {
		setTitle("Charges Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setPreferredSize(new Dimension(1200,800));	
		setLayout(new GridBagLayout());
		
		LeftMainPanel leftPanel = new LeftMainPanel();
		RightMainPanel rightPanel = new RightMainPanel();
		add(leftPanel);
		add(rightPanel);
		
		
		
		getContentPane().setLayout(new GridBagLayout());
	    GridBagConstraints gbc = new GridBagConstraints();
	
	    Border eBorder = BorderFactory.createEtchedBorder();
	    leftPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "70pct"));
	    gbc.gridx = gbc.gridy = 0;
	    gbc.gridwidth = gbc.gridheight = 1;
	    gbc.fill = GridBagConstraints.BOTH;
	    gbc.anchor = GridBagConstraints.SOUTH;
	    gbc.weightx = gbc.weighty = 70;
	    getContentPane().add(leftPanel, gbc);

	    rightPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "30pct"));
	    gbc.gridy = 1;
	    gbc.weightx = 30;
	    gbc.weighty = 30;
	    gbc.anchor = GridBagConstraints.NORTHEAST;
	    gbc.insets = new Insets(2, 2, 2, 2);
	    getContentPane().add(rightPanel, gbc);
	    pack();
		
		
	     
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	public MainFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	MainFrame mFrame = new MainFrame();
	mFrame.setVisible(true);
	

	}

}
