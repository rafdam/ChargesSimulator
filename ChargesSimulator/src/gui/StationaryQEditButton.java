package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

//author:Czajka
//button used to open frame where user can edit charge

public class StationaryQEditButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	StationaryQEditFrame editFrame;		
	
	public StationaryQEditButton() {
		super("EDIT");
		
		addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {             
            	editFrame = new StationaryQEditFrame();
            	editFrame.setVisible(true);             
            }
        });	
	}

}
