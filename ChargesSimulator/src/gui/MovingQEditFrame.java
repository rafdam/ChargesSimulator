package gui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MovingQEditFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JComboBox tValue;
	JTextField  tCoordinateX, tCoordinateY,tCoordinateZ, tVeloX,tVeloY,tVeloZ; 
	JLabel charge, value, coordinates,velocities;
	JButton editThis;
	String status;

	public MovingQEditFrame() throws HeadlessException {
	setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
    setSize(MainFrame.getAddFrameDim());        
    
    //  COMPONENTS OF EDIT FRAME //
    value  = new JLabel("Value [C]"); 
    coordinates = new JLabel("Coordinates (X,Y)");  
    velocities = new JLabel("Velocity (X,Y)");
    status = new String("");        
    tValue  =  new JComboBox();        
    tCoordinateX  = new JTextField();  
    tCoordinateY  = new JTextField();
    tCoordinateZ  = new JTextField();   
    tVeloX  = new JTextField();  
    tVeloY = new JTextField();  
    tVeloZ  = new JTextField();  
    editThis = new JButton("EDIT");
    
    tValue.addItem("Electron");
    tValue.addItem("Proton");
    
    
        
        // ADDING COMPONENTS //
         add(value,"width 50%, height 25%");
         add(tValue,"width 50%, height 25%,span,wrap");
         add(coordinates,"width 50%, height 25%");
         add(tCoordinateX,"width 12%, height 25%");
         add(tCoordinateY,"width 12%, height 25%, wrap");        
         add(velocities,"width 50%, height 25%");
         add(tVeloX,"width 12%, height 25%");
         add(tVeloY,"width 12%, height 25%,wrap");         
         add(editThis,"width 50%, height 25%");
         
         // get selected row data From table to textfields 
         MovingQInPanel.table.addMouseListener(new MouseAdapter(){         
         @Override
         public void mouseClicked(MouseEvent e){	             
             // i = the index of the selected row
             int i = MovingQInPanel.table.getSelectedRow();          
             
             tCoordinateX.setText(MovingQTable.model.getValueAt(i, 1).toString());
             tCoordinateY.setText(MovingQTable.model.getValueAt(i, 2).toString());
             
             tVeloX.setText(MovingQTable.model.getValueAt(i, 3).toString());
             tVeloY.setText(MovingQTable.model.getValueAt(i, 4).toString());             
         }
         });
         
         
         // button update row
         editThis.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e) {
            	 
                 // i = the index of the selected row
                 int i = MovingQInPanel.table.getSelectedRow();	                 
                 
                 if(i >= 0){	
                	 if (MovingQTable.model.getValueAt(i, 5).toString() == "OFF"){                		 	
                		 try{
     	            	   
     	            	   	
     		                
     		                 double xx = Double.parseDouble(tCoordinateX.getText().toString());
     		                 double yy = Double.parseDouble(tCoordinateY.getText().toString());
     		                
     		                 double vx =  Double.parseDouble(tVeloX.getText().toString());
     		                 double vy =  Double.parseDouble(tVeloY.getText().toString());
     		                 MovingQTable.model.setValueAt(tValue.getSelectedItem(), i, 0);
	      	            	 MovingQTable.model.setValueAt(tCoordinateX.getText(), i, 1);
	      	            	 MovingQTable.model.setValueAt(tCoordinateY.getText(), i, 2);
	      	            	
	      	            	 MovingQTable.model.setValueAt(tVeloX.getText(),i,3);
	      	            	 MovingQTable.model.setValueAt(tVeloY.getText(),i,4);
	      	            	
		                	setVisible(false);
	  	            	   	dispose();	
     		                  
     		                 }
     		                 catch(NumberFormatException z){
     		                	 JOptionPane.showMessageDialog(MainFrame.leftPanel, "Error - try filling fields with numbers");
     		                 }
	      	            	      	               
                	 }
                	 
                	 else {
                		 setVisible(false);
  	            	   	 dispose();
  	            	   JOptionPane.showMessageDialog(MainFrame.leftPanel, 
        		 			   "Turn OFF the charge before editing it"); 
                	 }	                     
                 }
         	
                 else{
                	 JOptionPane.showMessageDialog(MainFrame.leftPanel, 
      		 			   "Edit Error - Probably there is no charge or none of charge is selected.");
                 }
             }
         });
	
	
	

}
}


