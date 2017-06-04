package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import model.HeatMap;

public class HeatMapDeployButton extends JCheckBox{
	HeatMap HM;

	/**
	 * 
	 */
	boolean status;
	private static final long serialVersionUID = 1L;
	public HeatMapDeployButton(){
		super("Off");
		status = false;
		ActionListener al1 = new ActionListener(){

			/*public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HM = new HeatMap(StationaryQTable.GetChargesList());
				MainFrame.leftPanel.repaint();
			}
*/
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(status == false){
					HM = new HeatMap(StationaryQTable.GetChargesList());
					MainFrame.leftPanel.repaint();
					setText("On");
					status = true;
					
				}
				else{
					HeatMap.getHeatMap().removeAll(HeatMap.getHeatMap());
					MainFrame.leftPanel.repaint();
					setText("Off");
					status = false;
					System.out.println("OFF");
					
				}
			}
			
		};
		addActionListener(al1);
		
		
	}

}
