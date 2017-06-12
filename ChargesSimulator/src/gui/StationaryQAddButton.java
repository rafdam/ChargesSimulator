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

}
