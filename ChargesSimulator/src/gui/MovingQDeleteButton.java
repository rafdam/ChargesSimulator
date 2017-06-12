package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//author: Czajka
//Button used to deleting moving charges

public class MovingQDeleteButton extends JButton {
/**
 * 
 */
private static final long serialVersionUID = 1L;

public MovingQDeleteButton() {
	super("DELETE");
	
	addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
         
            // i = the index of the selected row
            int i = MovingQInPanel.table.getSelectedRow();	                 
            
	         if(i >= 0){	
	           	 if (MovingQTable.model.getValueAt(i, 5).toString() == "ON"){
	           		JOptionPane.showMessageDialog(MainFrame.leftPanel, 
               				"Turn OFF charge before deleting it.");          
	           	 }
	           	 
	           	 else if (MovingQTable.model.getValueAt( i,  5).toString() == "OFF"){
	           		MovingQTable.model.removeRow(i); 
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
}
}