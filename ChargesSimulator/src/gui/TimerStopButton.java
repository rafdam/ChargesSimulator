package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class TimerStopButton extends JButton {

	public TimerStopButton() {
		super("STOP");
		
	}

	public TimerStopButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public TimerStopButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public TimerStopButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public TimerStopButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
