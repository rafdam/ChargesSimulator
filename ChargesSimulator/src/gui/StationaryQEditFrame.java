package gui;

import java.awt.GraphicsConfiguration; 
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

//author:Czajka
//Frame for editing charges


public class StationaryQEditFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField  tValue, tCoordinateX, tCoordinateY,tCoordinateZ; 
	JLabel charge, value, coordinates;
	JButton editThis;
	String status;

	public StationaryQEditFrame() throws HeadlessException {
		setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
        setSize(MainFrame.getAddFrameDim());        
        
        //  COMPONENTS OF EDIT FRAME //
        value  = new JLabel("Value [C]"); 
        coordinates = new JLabel("Coordinates (X,Y,Z)");             
        status = new String("");        
        tValue  =  new JTextField();        
        tCoordinateX  = new JTextField();  
        tCoordinateY  = new JTextField();
        tCoordinateZ  = new JTextField();        
        editThis = new JButton("EDIT");
        
        
	        
	        // ADDING COMPONENTS //
	         add(value,"width 50%, height 25%");
	         add(tValue,"width 50%, height 25%,span,wrap");
	         add(coordinates,"width 50%, height 25%");
	         add(tCoordinateX,"width 12%, height 25%");
	         add(tCoordinateY,"width 12%, height 25%");
	         add(tCoordinateZ, "width 12%, height 25%,wrap");
	         add(editThis,"width 50%, height 25%");
	         
	         // get selected row data From table to textfields 
	         StationaryQInPanel.table.addMouseListener(new MouseAdapter(){
	         
	         @Override
	         public void mouseClicked(MouseEvent e){	             
	             // i = the index of the selected row
	             int i = StationaryQInPanel.table.getSelectedRow();
	          
	             tValue.setText(StationaryQTable.model.getValueAt(i, 0).toString());
	             tCoordinateX.setText(StationaryQTable.model.getValueAt(i, 1).toString());
	             tCoordinateY.setText(StationaryQTable.model.getValueAt(i, 2).toString());
	             tCoordinateZ.setText(StationaryQTable.model.getValueAt(i, 3).toString());
	         }
	         });
	         
	         // button update row
	         editThis.addActionListener(new ActionListener(){
	             public void actionPerformed(ActionEvent e) {
	              
	                 // i = the index of the selected row
	                 int i = StationaryQInPanel.table.getSelectedRow();	                 
	                 
	                 if(i >= 0){	
	                	 if (StationaryQTable.model.getValueAt(i, 4).toString() == "OFF"){
	                		 	if(tValue.getText().equals("")){
		      	            	   System.out.println("Please fill field with value of charge"); 
		      	            	   setVisible(false);
		      	            	   dispose();	      	            	 
		      	               }
		      	               else if(tCoordinateX.getText().equals("") || tCoordinateY.getText().equals("")|| tCoordinateZ.getText().equals("") ){
		  	            	   		setVisible(false);
		  	            	   		dispose();
		  	            	   		System.out.println("Please fill coordinates of charge"); 
		      	               }
		      	               else{
		                		 StationaryQTable.model.setValueAt(tValue.getText(), i, 0);
			                	 StationaryQTable.model.setValueAt(tCoordinateX.getText(), i, 1);
			                	 StationaryQTable.model.setValueAt(tCoordinateY.getText(), i, 2);
			                	 StationaryQTable.model.setValueAt(tCoordinateZ.getText(), i, 3);
			                	 setVisible(false);
		  	            	   	 dispose();
		      	               }
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

	public StationaryQEditFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQEditFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StationaryQEditFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
