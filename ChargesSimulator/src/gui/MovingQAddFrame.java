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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MovingQAddFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JComboBox tValue;
	JLabel charge, value, coordinates, velocity;
	JTextField  tCoordinateX, tCoordinateY,tCoordinateZ, tVelocityX, tVelocityY, tVelocityZ;	
	JButton addThis;	
	
	public MovingQAddFrame() throws HeadlessException {
		super("ADD CHARGE");			
        setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
        setSize(MainFrame.getAddFrameDim());         
      
        // Componets of the frame //
        value  = new JLabel("Value [C]"); 
        coordinates = new JLabel("Coordinates (X,Y)");  
        velocity = new JLabel ("Velocity (Vx, Vy)");
        tValue  =  new JComboBox();        
        tCoordinateX  = new JTextField();  
        tCoordinateY  = new JTextField();
        tCoordinateZ  = new JTextField();  
        tVelocityX = new JTextField();
        tVelocityY = new JTextField();
        tVelocityZ = new JTextField();
        addThis = new JButton("ADD");
        tValue.addItem("Electron");
        tValue.addItem("Proton");
        
        
        
        		// Adding the componets //
	         add(value,"width 50%, height 25%");
	         add(tValue,"width 50%, height 25%,span,wrap");
	         add(coordinates,"width 50%, height 25%");
	         add(tCoordinateX,"width 12%, height 25%");
	         add(tCoordinateY,"width 12%, height 25%,wrap");	      
	         add(velocity,"width 50%,height 25%");
	         add(tVelocityX,"width 12%, height 25%");
	         add(tVelocityY,"width 12%, height 25%, wrap");	    
	         add(addThis,"width 50%, height 25%");
	         
	         
	   // create an array of objects to set the row data
	     final Object[] row = new Object[6];    
	     
	     	addThis.addActionListener(new ActionListener(){
	             public void actionPerformed(ActionEvent e) {
	            	
	          //   tValue.getSelectedItem().toString();
	            	    
	               
	               if(tCoordinateX.getText().equals("") || tCoordinateY.getText().equals("") || tVelocityX.getText().equals("") || tVelocityY.getText().equals("")){
	            	   JOptionPane.showMessageDialog(MainFrame.leftPanel, "All of fields need to be filled.");
	               }
	               else{
	            	   	// DATA FOR TABLE OF CHARGE //
	            	   	 row[0] = tValue.getSelectedItem().toString();
		                 row[1] = tCoordinateX.getText();
		                 row[2] = tCoordinateY.getText();		                 
		                 row[3] = tVelocityX.getText();
		                 row[4] = tVelocityY.getText();		                
		                 row[5] = "OFF";
		                 
		                 // add row to the model
		                 MovingQTable.model.addRow(row);	            	   
	               }                 
	             }
	         });	
	}
}
