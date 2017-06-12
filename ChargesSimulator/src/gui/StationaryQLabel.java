package gui;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//author:Czajka

public class StationaryQLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StationaryQLabel() {
		super("Stationary Charges");
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("Tahoma", Font.BOLD, 16));
	}
}
