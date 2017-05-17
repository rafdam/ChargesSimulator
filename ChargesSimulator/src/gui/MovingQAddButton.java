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
	private static final long serialVersionUID = 1L;

	

	public MovingQAddButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public MovingQAddButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public MovingQAddButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public MovingQAddButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
