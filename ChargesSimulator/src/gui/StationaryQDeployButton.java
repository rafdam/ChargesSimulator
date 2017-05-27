package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import model.StationaryCharge;


//author:Czajka
//Button use to turn on/off charge on screen

public class StationaryQDeployButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String status;	
	StationaryCharge ch;
	double value, xx, yy, zz;
	 
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
            status = StationaryQTable.model.getValueAt(i, 4).toString();
            ch = new StationaryCharge(xx,yy,zz,value/100000);          
        	}
        });
        
        // button update row
        addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = StationaryQInPanel.table.getSelectedRow();
                
                if(i >= 0) 
                {
                	if(status == "ON"){				 //If user click ON/OFF button charge will be turn off and disapear from screen
                		StationaryQTable.model.setValueAt("OFF", i, 4);
                		StationaryQTable.GetChargesList().remove(StationaryQTable.GetChargesList().get(0));
                		MainFrame.ChangeStationaryQ(ch);
                		
                	}                	
                	else if(status == "OFF"){ 		//Makes charge appear on screen and calculate all data
                		StationaryQTable.model.setValueAt("ON", i, 4);
                		MainFrame.AddStationaryQ(ch);
                		StationaryQTable.GetChargesList().add(ch);                		
                		}
               	
                	else{System.out.println("Deploy error");}
                }
                else{
                    System.out.println("Deploy Error");
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
