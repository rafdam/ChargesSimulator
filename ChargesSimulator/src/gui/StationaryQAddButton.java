package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

//author:Czajka
//button opening small frame where user can add charges

public class StationaryQAddButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	StationaryQAddFrame addFrame;	
	
	public StationaryQAddButton() {
		super("ADD");
		
		addActionListener(new ActionListener(){   
            public void actionPerformed(ActionEvent e) {             
            StationaryQAddFrame addFrame = new StationaryQAddFrame();
            addFrame.setVisible(true);             
            }
        });
				
	}

	public StationaryQAddButton(Icon arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQAddButton(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQAddButton(Action arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQAddButton(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
