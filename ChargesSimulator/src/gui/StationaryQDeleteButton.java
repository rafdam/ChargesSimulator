package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;


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
               		System.out.println("Turn off charge at the first place");         
               	 }
               	 
               	 else if (StationaryQTable.model.getValueAt( i,  3).toString() == "OFF"){
               		StationaryQTable.model.removeRow(i); 
               	 }
               	 else{
               		 System.out.println("Delete error");
               	 }
                 }
                else{
               	 
                    System.out.println("Update Error");
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

	public StationaryQDeleteButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeleteButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeleteButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeleteButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
