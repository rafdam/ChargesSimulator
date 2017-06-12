package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


//author: Czajka
//button use for deleting stationary charges from table

public class StationaryQDeleteButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StationaryQDeleteButton() {
		super("DELETE");
		
		addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = StationaryQInPanel.table.getSelectedRow();	                 
                
                if(i >= 0){	
	               	 if (StationaryQTable.model.getValueAt(i, 3).toString() == "ON"){
	               		JOptionPane.showMessageDialog(MainFrame.leftPanel, 
	               				"Turn OFF charge before deleting it.");               		        
	               	 }
	               	 
	               	 else if (StationaryQTable.model.getValueAt( i,  3).toString() == "OFF"){
	               		StationaryQTable.model.removeRow(i); 
	               	 }
	               	 
	               	 else{
	               		JOptionPane.showMessageDialog(MainFrame.leftPanel,
	               				"Error during deleting, try to select the charge once more.");
	               	 	}
                 }
                else{  
                	JOptionPane.showMessageDialog(MainFrame.leftPanel, 
                			"Error during deleting, probably there is no charges to delete or none charge is select.");                   
                }
            }
        });
		
		// button remove row
        //addActionListener(new ActionListener(){
        	
        	/*int i = StationaryQInPanel.table.getSelectedRow();	 
            public void actionPerformed(ActionEvent e) {
            	if (StationaryQTable.model.getValueAt(i, 4).toString() == "OFF"){
                // i = the index of the selected row
                int i = StationaryQInPanel.table.getSelectedRow();
                
                if(i >= 0){
                    // remove a row from jtable
                	StationaryQTable.model.removeRow(i);                	
                }
                
            	}
                
                else if (StationaryQTable.model.getValueAt(i,4).toString() == "ON"){
                    System.out.println("Turn off the charge");
                }
                else{
                	System.out.println("Delete error");
                }
            }
            */
        	// i = the index of the selected row
            
	}
}
