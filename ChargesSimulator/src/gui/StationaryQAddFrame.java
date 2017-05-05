package gui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class StationaryQAddFrame extends JFrame {
	JLabel charge, value, coordinates;
	JTextField tCharge, tValue, tCoordinates; 
	JButton addThis;
	
	
	public StationaryQAddFrame() throws HeadlessException {
		super("ADD CHARGE");			
        setLayout(new MigLayout("", "[] []","[] [] [] []"));
        setSize(MainFrame.getAddFrameDim());    
        charge = new JLabel("Charge");
        value  = new JLabel("Value [C]"); 
        coordinates = new JLabel("Coordinates");
        tCharge  = new JTextField();
        tValue  =  new JTextField(); 
        tCoordinates  = new JTextField();
        addThis = new JButton("ADD");
	           add(charge,"width 50%, height 25%");
	           add(tCharge,"width 50%, height 25%, wrap");
	           add(value,"width 50%, height 25%");
	           add(tValue,"width 50%, height 25%, wrap");
	           add(coordinates,"width 50%, height 25%");
	           add(tCoordinates,"width 50%, height 25%, wrap");
	           add(addThis,"width 50%, height 25%, span");
			
		
		
		
		
		
	}

	public StationaryQAddFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQAddFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQAddFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
