package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

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

	public StationaryQEditButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public StationaryQEditButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public StationaryQEditButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public StationaryQEditButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
