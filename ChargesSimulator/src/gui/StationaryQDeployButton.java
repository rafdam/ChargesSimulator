package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class StationaryQDeployButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String status;
	
	public StationaryQDeployButton() {
		super("ON / OFF");
		status = new String("");
		
		 // get selected row data From table to textfields 
        StationaryQInPanel.table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = StationaryQInPanel.table.getSelectedRow();
        
            status = StationaryQTable.model.getValueAt(i, 5).toString();
        }
        });
        
        // button update row
        addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = StationaryQInPanel.table.getSelectedRow();
                
                if(i >= 0) 
                {
                	if(status == "ON"){StationaryQTable.model.setValueAt("OFF", i, 5);}
                	
                	else if(status == "OFF"){StationaryQTable.model.setValueAt("ON", i, 5);}
               	
                	else{System.out.println("Deploy error");}
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
	
	

	}

	public StationaryQDeployButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeployButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeployButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeployButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
