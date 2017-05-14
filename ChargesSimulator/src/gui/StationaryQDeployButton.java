package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import model.StationaryCharge;

public class StationaryQDeployButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String status;
	double value, xx, yy, zz;
	 StationaryCharge ch;
	 
	public StationaryQDeployButton() {
		super("ON / OFF");
		status = new String("");
		
		 // get selected row data from table to textfields 
        StationaryQInPanel.table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = StationaryQInPanel.table.getSelectedRow();
            value = Double.parseDouble(StationaryQTable.model.getValueAt(i, 0).toString());
            xx =  Double.parseDouble(StationaryQTable.model.getValueAt(i, 1).toString());
            yy =  Double.parseDouble(StationaryQTable.model.getValueAt(i, 2).toString());
            zz =  Double.parseDouble(StationaryQTable.model.getValueAt(i, 3).toString());
            ch = new StationaryCharge(xx,yy,zz,value);

            status = StationaryQTable.model.getValueAt(i, 4).toString();
        }
        });
        
        // button update row
        addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = StationaryQInPanel.table.getSelectedRow();
                
                if(i >= 0) 
                {
                	if(status == "ON"){
                		StationaryQTable.model.setValueAt("OFF", i, 4);
                	
                		
                	}
                	
                	else if(status == "OFF"){
                		StationaryQTable.model.setValueAt("ON", i, 4);
                		MainFrame.AddStationaryQ(ch);
                		System.out.println("dodaje wartości"+xx+yy+zz);
                		}
               	
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
