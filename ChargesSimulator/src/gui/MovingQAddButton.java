package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

//author: Czajka
//Button used to adding moving charges

public class MovingQAddButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	StationaryQAddFrame addFrame;
	
	
	public MovingQAddButton() {
		super("ADD");
		
		addActionListener(new ActionListener(){   
            public void actionPerformed(ActionEvent e) {             
            MovingQAddFrame addFrame = new MovingQAddFrame();
            addFrame.setVisible(true);             
            }
        });
				
	}
}
