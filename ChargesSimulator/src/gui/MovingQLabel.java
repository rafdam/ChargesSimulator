package gui;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MovingQLabel extends JLabel {

	public MovingQLabel() {
		super("Moving Charges");
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("Tahoma", Font.BOLD, 14));
	}

	public MovingQLabel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public MovingQLabel(Icon image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public MovingQLabel(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public MovingQLabel(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public MovingQLabel(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

}
