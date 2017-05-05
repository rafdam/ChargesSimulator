package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class StationaryQAddButton extends JButton {
	StationaryQAddFrame addFrame;

	
	
	
	public StationaryQAddButton() {
		super("ADD");
		
		
		
		addActionListener(new ActionListener(){

            @Override
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
