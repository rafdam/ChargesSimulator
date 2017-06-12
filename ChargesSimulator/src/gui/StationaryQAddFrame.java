package gui;

import java.awt.Graphics;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

//author:Czajka
//Frame where user can add charges

public class StationaryQAddFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JLabel charge, value, coordinates;
	JTextField  tValue, tCoordinateX, tCoordinateY;	
	JButton addThis;	
	
	
	public StationaryQAddFrame() throws HeadlessException {
		super("ADD CHARGE");			
        setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
        setSize(MainFrame.getAddFrameDim());         
      
        // Componets of the frame //
        value  = new JLabel("Value [C*10^(-19)]"); 
        coordinates = new JLabel("Coordinates (X,Y)");            
        tValue  =  new JTextField();        
        tCoordinateX  = new JTextField();  
        tCoordinateY  = new JTextField();
               
        addThis = new JButton("ADD");
        
        		// Adding the componets //
	         add(value,"width 50%, height 25%");
	         add(tValue,"width 50%, height 25%,span,wrap");
	         add(coordinates,"width 50%, height 25%");
	         add(tCoordinateX,"width 12%, height 25%");
	         add(tCoordinateY,"width 12%, height 25%,wrap");
	         add(addThis,"width 50%, height 25%");
	         
	         
	   // create an array of objects to set the row data
	     final Object[] row = new Object[5];    
	     
	     	addThis.addActionListener(new ActionListener(){
	             public void actionPerformed(ActionEvent e) { 	
	            	 
	               if(tValue.getText().equals("") || tCoordinateX.getText().equals("") || tCoordinateY.getText().equals("")){
	            	   JOptionPane.showMessageDialog(MainFrame.leftPanel, "All of fields need to be filled.");
	               }	               
	               
	               else{
	            	   	// DATA FOR TABLE OF CHARGE //
	            	   try{
	            	   	 row[0] = tValue.getText();
		                 row[1] = tCoordinateX.getText();
		                 row[2] = tCoordinateY.getText();		                 
		                 row[3] = "OFF";
		                 double valuee  = Double.parseDouble(tValue.getText().toString());
		                 double xx 	   = Double.parseDouble(tCoordinateX.getText().toString());
		                 double yy 	   = Double.parseDouble(tCoordinateY.getText().toString());
		                 
		                 
		                 // add row to the model
		                 
	            	   }
	            	   catch(NumberFormatException z){
	            		   JOptionPane.showMessageDialog(MainFrame.leftPanel, "Error - Try filling fields with numbers");
	            	   }
	            	   StationaryQTable.model.addRow(row);
	               }                 
	             }
	        });	
	}
}
