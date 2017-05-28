package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class TimerStartButton extends JButton {

	public TimerStartButton() {
		super("START");
		
		ActionListener start = new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				LeftMainPanel.setAnimation(true);
				
				
			}
		};
		this.addActionListener(start);
	}
	

	public TimerStartButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public TimerStartButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public TimerStartButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public TimerStartButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
