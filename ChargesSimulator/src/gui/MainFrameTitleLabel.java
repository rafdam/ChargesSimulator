package gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
//author: Czajka
//Label with program title

public class MainFrameTitleLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrameTitleLabel() {
		super("CHARGES SIMULATOR");
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("Tahoma", Font.BOLD, 40));		
	}

	

}
