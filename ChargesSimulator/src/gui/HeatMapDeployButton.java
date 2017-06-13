package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import model.HeatMap;

public class HeatMapDeployButton extends JCheckBox{
	//Author:rafdam
	//Turning on/off heatmap
	HeatMap HM;

	/**
	 * 
	 */
	static boolean status;
	private static final long serialVersionUID = 1L;
	public HeatMapDeployButton(){
		super("Potential Field OFF");
		setToolTipText("Turn ON or OFF potential filed (WORKS ONLY WHEN ANIMATION IS OFF)");
		status = false;
		ActionListener al1 = new ActionListener(){

			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(status == false){
					HM = new HeatMap(StationaryQTable.GetChargesList()); //creating HM object which gonna be painted later
					MainFrame.leftPanel.repaint();
					setText("Potential Field ON");
					status = true;
					//System.out.println("ON");
					MovingQPanel.startButton.setEnabled(false);
					MovingQPanel.stopButton.setEnabled(false);//Making Animation unable to run
					
					
				}
				else{
					HeatMap.getHeatMap().removeAll(HeatMap.getHeatMap()); //deleting HM object and repainting panel to its before state
					MainFrame.leftPanel.repaint();
					setText("Potential Field OFF");
					status = false;
					//System.out.println("OFF");
					MovingQPanel.startButton.setEnabled(true);//making animation able to run
					
				}
			}
			
		};
		addActionListener(al1);
		
		
	}

}
