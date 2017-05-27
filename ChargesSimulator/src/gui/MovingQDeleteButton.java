package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

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
           	 if (MovingQTable.model.getValueAt(i, 7).toString() == "ON"){
           		System.out.println("Turn off charge at the first place");         
           	 }
           	 
           	 else if (MovingQTable.model.getValueAt( i,  7).toString() == "OFF"){
           		MovingQTable.model.removeRow(i); 
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
	
	
        
}

public MovingQDeleteButton(Icon icon) {
	super(icon);
	// TODO Auto-generated constructor stub
}

public MovingQDeleteButton(String text) {
	super(text);
	// TODO Auto-generated constructor stub
}

public MovingQDeleteButton(Action a) {
	super(a);
	// TODO Auto-generated constructor stub
}

public MovingQDeleteButton(String text, Icon icon) {
	super(text, icon);
	// TODO Auto-generated constructor stub
}

}