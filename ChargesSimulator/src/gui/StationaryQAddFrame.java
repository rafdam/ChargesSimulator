package gui;



import java.awt.Graphics;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import model.StationaryCharge;

import net.miginfocom.swing.MigLayout;

public class StationaryQAddFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel charge, value, coordinates;
	JTextField  tValue, tCoordinateX, tCoordinateY,tCoordinateZ; 
	JComboBox cbCharges;
	JButton addThis;	
	
	
	public StationaryQAddFrame() throws HeadlessException {
		super("ADD CHARGE");			
        setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
        setSize(MainFrame.getAddFrameDim()); 
        
      
        value  = new JLabel("Value [C]"); 
        coordinates = new JLabel("Coordinates (X,Y,Z)");
        
        
        String[] chargeString = {"positive", "negative"};
        cbCharges  = new JComboBox(chargeString);
        cbCharges.setSelectedIndex(1);        
        
        
        tValue  =  new JTextField();        
        tCoordinateX  = new JTextField();  
        tCoordinateY  = new JTextField();
        tCoordinateZ  = new JTextField();        
        addThis = new JButton("ADD");
        
	    
	         
	         add(value,"width 50%, height 25%");
	         add(tValue,"width 50%, height 25%,span,wrap");
	         add(coordinates,"width 50%, height 25%");
	         add(tCoordinateX,"width 12%, height 25%");
	         add(tCoordinateY,"width 12%, height 25%,");
	         add(tCoordinateZ, "width 12%, height 25%,wrap");
	         add(addThis,"width 50%, height 25%");
	         
	         
	   // create an array of objects to set the row data
	     final Object[] row = new Object[5];
	         
	         // button add row
	     
	     
	     
	     	addThis.addActionListener(new ActionListener(){

	             public void actionPerformed(ActionEvent e) {
	            	 
	            	 
	              
	               
	            	 
	            	 
	            	 row[0] = tValue.getText();
	                 row[1] = tCoordinateX.getText();
	                 row[2] = tCoordinateY.getText();
	                 row[3] = tCoordinateZ.getText();
	                 row[4] = "OFF";
	                 // add row to the model
	                 StationaryQTable.model.addRow(row);
	                 
	                 
	                 
	             }
	         });
	     
			
		
		
		
		
		
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

	public void DrawStationaryQ(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	

}