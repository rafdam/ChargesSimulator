package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.ChargesPotential;
import model.HeatMap;
import model.StationaryCharge;
import model.TestPoint;


//author:Czajka
//Button use to turn on/off charge on screen

public class StationaryQDeployButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String status;	
	StationaryCharge ch;
	double  xx, yy, zz;
	double value;
	HeatMap HM;
	int i;
	
	
	 
	public StationaryQDeployButton() {
		super("ON / OFF");
		status = new String("");
		
		
		 // get selected row data from table to textfields 
        StationaryQInPanel.table.addMouseListener(new MouseAdapter(){        
        @Override
        public void mouseClicked(MouseEvent e){
        	
            // i = the index of the selected row        	
             i = StationaryQInPanel.table.getSelectedRow();
            
            value  = Double.parseDouble(StationaryQTable.model.getValueAt(i, 0).toString());
            xx 	   = Double.parseDouble(StationaryQTable.model.getValueAt(i, 1).toString());
            yy 	   = Double.parseDouble(StationaryQTable.model.getValueAt(i, 2).toString());
            status = StationaryQTable.model.getValueAt(i, 3).toString();
            ch = new StationaryCharge(xx,yy,value*Math.pow(10, -20)); //creating new basic object 														  //to later add it to stationarychargesList    
            
            
            
        	}
        });
        
        // button update row
        addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {             
                // i = the index of the selected row
                // i = StationaryQInPanel.table.getSelectedRow();
            	//JOptionPane.showMessageDialog(MainFrame.leftPanel,i);
            	
            	if(i >= 0) 
                {
	                	if(status == "ON"){				 //If user click ON/OFF button charge will be turn off and disapear from screen
	                		StationaryQTable.model.setValueAt("OFF", i, 3);
	                		StationaryQTable.GetChargesList().remove(StationaryQTable.GetChargesList().get(i));
	                		MainFrame.ChangeStationaryQ(ch);	
	                	}   
	                	
	                	else if(status == "OFF"){ 		//Makes charge appear on screen and calculate all data
	                		try{
	                		StationaryQTable.model.setValueAt("ON", i, 3);
	                		MainFrame.AddStationaryQ(ch);
	                		StationaryQTable.GetChargesList().add(ch);        
	                		}
	                		catch(NumberFormatException z){
	                			JOptionPane.showMessageDialog(MainFrame.leftPanel, "Error during inizalization of charge");
	                		}
	                	}
	               	
	                	else{JOptionPane.showMessageDialog(MainFrame.leftPanel, 
	                			"Deploy Error - Probrably there is no charge or none of charge is selected");}	                	
                }           
                
                else{JOptionPane.showMessageDialog(MainFrame.leftPanel, 
            			"Deploy Error - Probrably there is no charge or none of charge is selected");}
            }
        });
	}
}
