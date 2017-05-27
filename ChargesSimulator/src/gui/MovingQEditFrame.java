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
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MovingQEditFrame extends JFrame {
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
    coordinates = new JLabel("Coordinates (X,Y,Z)");  
    velocities = new JLabel("Velocity (X,Y,Z)");
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
         add(tCoordinateY,"width 12%, height 25%");
         add(tCoordinateZ, "width 12%, height 25%,wrap");
         add(velocities,"width 50%, height 25%");
         add(tVeloX,"width 12%, height 25%");
         add(tVeloY,"width 12%, height 25%,");
         add(tVeloZ,"width 12%, height 25%,wrap");
         add(editThis,"width 50%, height 25%");
         
         // get selected row data From table to textfields 
         MovingQInPanel.table.addMouseListener(new MouseAdapter(){
         
         @Override
         public void mouseClicked(MouseEvent e){	             
             // i = the index of the selected row
             int i = MovingQInPanel.table.getSelectedRow();
          
             
             tCoordinateX.setText(MovingQTable.model.getValueAt(i, 1).toString());
             tCoordinateY.setText(MovingQTable.model.getValueAt(i, 2).toString());
             tCoordinateZ.setText(MovingQTable.model.getValueAt(i, 3).toString());
             tVeloX.setText(MovingQTable.model.getValueAt(i, 4).toString());
             tVeloY.setText(MovingQTable.model.getValueAt(i, 5).toString());
             tVeloZ.setText(MovingQTable.model.getValueAt(i, 6).toString());
             
             
         }
         });
         
         // button update row
         editThis.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e) {
              
                 // i = the index of the selected row
                 int i = MovingQInPanel.table.getSelectedRow();	                 
                 
                 if(i >= 0){	
                	 if (MovingQTable.model.getValueAt(i, 7).toString() == "OFF"){
                		 	
	      	              
	      	            	MovingQTable.model.setValueAt(tValue.getSelectedItem(), i, 0);
	      	            	MovingQTable.model.setValueAt(tCoordinateX.getText(), i, 1);
	      	            	MovingQTable.model.setValueAt(tCoordinateY.getText(), i, 2);
	      	            	MovingQTable.model.setValueAt(tCoordinateZ.getText(), i, 3);
	      	            	MovingQTable.model.setValueAt(tVeloX.getText(),i,4);
	      	            	MovingQTable.model.setValueAt(tVeloY.getText(),i,5);
	      	            	MovingQTable.model.setValueAt(tVeloZ.getText(),i,6);
		                	setVisible(false);
	  	            	   	dispose();
	      	               
                	 }
                	 
                	 else {
                		 setVisible(false);
  	            	   	 dispose();
                		 System.out.println("Turn off charge at the first place");
                	 }	                     
                 }
                 else{
                	 setVisible(false);
	            	   	 dispose();
                     System.out.println("Update Error");
                 }
             }
         });
	
	
	

}
}


