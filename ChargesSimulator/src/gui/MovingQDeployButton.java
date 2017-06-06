package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import model.StationaryCharge;
import model.TestCharge;

public class MovingQDeployButton extends JButton {
	
	//author: rafdam & czajka
	// Class deploying and actually creating TestCharge and putting it to the model
	/**
 * 
 */
private static final long serialVersionUID = 1L;
String status;	
TestCharge ch;
double vx,vy,vz,xx, yy, zz;
boolean val;

public MovingQDeployButton() {
	super("ON / OFF");
	status = new String("");
	
	 // get selected row data from table to textfields 
   MovingQInPanel.table.addMouseListener(new MouseAdapter(){
   
   @Override
   public void mouseClicked(MouseEvent e){
   	
       // i = the index of the selected row        	
       int i = MovingQInPanel.table.getSelectedRow();
       
     //  value
       if (MovingQTable.model.getValueAt(i, 0).toString() == "Electron"){
    	   val = false;
       }
       else if(MovingQTable.model.getValueAt(i, 0).toString() == "Proton"){
    	   val = true;
       }
       
       
       //all the values must be parsed to double from table-model which must be parsed to string before
       xx = Double.parseDouble(MovingQTable.model.getValueAt(i, 1).toString());
       yy = Double.parseDouble(MovingQTable.model.getValueAt(i, 2).toString());
       zz = Double.parseDouble(MovingQTable.model.getValueAt(i, 3).toString());
       vx =  Double.parseDouble(MovingQTable.model.getValueAt(i, 4).toString());
       vy =  Double.parseDouble(MovingQTable.model.getValueAt(i, 5).toString());
       vz =  Double.parseDouble(MovingQTable.model.getValueAt(i, 6).toString());
       status = MovingQTable.model.getValueAt(i, 7).toString();
       ch = new TestCharge(val,vx,vy,xx, yy);      //creating object of testcharge  
   	
   }
   });
   
   // button update row
   addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e) {
        
           // i = the index of the selected row
           int i = MovingQInPanel.table.getSelectedRow(); 
           
           if(i >= 0) 
           {
           	if(status == "ON"){				 //If user click ON/OFF button charge will be turn off and disapear from screen
           		MovingQTable.model.setValueAt("OFF", i, 7);
           		MovingQTable.GetQList().remove(MovingQTable.GetQList().get(i)); // removing i'th charge from the list of testcharges
           		MainFrame.AddMovingQ(ch);
           		
           	}                	
           	else if(status == "OFF"){ 		//Makes charge appear on screen and calculate all data
           		MovingQTable.model.setValueAt("ON", i, 7);
           		MainFrame.AddMovingQ(ch); // adding charge to the list
           		MovingQTable.GetQList().add(ch);                		
           		}
          	
           	else{System.out.println("Deploy error");}
           }
           else{
               System.out.println("Deploy Error");
               }
               
           }
       });
	}

	

}
