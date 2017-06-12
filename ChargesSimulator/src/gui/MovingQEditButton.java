package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

//author: Czajka
//Button used to edit properites of moving charges

public class MovingQEditButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MovingQEditFrame editFrame;
	
	public MovingQEditButton() {
		super("EDIT");
		
		addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {             
            	editFrame = new MovingQEditFrame();
            	editFrame.setVisible(true);             
            }
        });	
	}
}
