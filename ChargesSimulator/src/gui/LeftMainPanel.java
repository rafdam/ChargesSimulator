package gui;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import model.ChargesList;
import model.ChargesPotential;
import model.HeatMap;
import model.StationaryCharge;
import model.TestCharge;
import model.TestChargeMotion;
import model.TestChargesList;
import model.TestPoint;
//author: Czajka & rafdam
//PANEL WITH DISPLAYED CHARGES
public class LeftMainPanel extends JPanel{
	

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	int interval = 20; // time jump between each tick of timer - 20ms
	static Timer timer; // Object of superclass Timer
	
	
	
	
	
	
	
	public LeftMainPanel() { 	
		
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setLayout(null);
		timer = new Timer(interval, new TimerAction());		
		
		
		}
	
	
	public static void setAnimation(boolean turnOnOff){//creating animation, turning on/off timer 
		if(turnOnOff){
			timer.start();
		}
		else{
			timer.stop();
		}
	}

	public void paintComponent(Graphics g) {//drawing each component on the panel, stat charges, mov charges and HeatMap ( 700 000 ovals - bad efficiency )
		super.paintComponent(g);
		//drawing all the dynamic components taken from a static arraylists let us draw them all on 1 thread 
	
		try{//drawing potentials
		for(int o = 0; o < HeatMap.getHeatMap().size(); o++){
			HeatMap.getHeatMap().get(o).draw(g);
			}
		}
		catch(NullPointerException e){
			
		}
		
		
		
		//drawing stat charges
        for(int i = 0; i < StationaryQTable.GetChargesList().size(); i++){
        StationaryQTable.GetChargesList().get(i).draw(g);
        	}
        //drawing TestCharges
        for(int j = 0; j < MovingQTable.GetQList().size(); j++){
        	MovingQTable.GetQList().get(j).draw(g);
        }
        
}
	
	
	
	
	
	class TimerAction implements ActionListener{ // definition of recurency in animation using objects and calc from model
		// time is changed my interval

		public void actionPerformed(ActionEvent e) {
			
			for(int jj = 0 ; jj < MovingQTable.GetQList().size(); jj++){
				TestPoint testPoint = new TestPoint(MovingQTable.GetQList().get(jj).getTestChargeCoordX(), MovingQTable.GetQList().get(jj).getTestChargeCoordY());
				
						
			ChargesPotential ch = new ChargesPotential(StationaryQTable.GetChargesList(), testPoint);
			TestChargeMotion TCM = new TestChargeMotion(ch ,MovingQTable.GetQList().get(jj), (double)interval/1000);
			MovingQTable.GetQList().get(jj).setTestChargeXCord(TCM.getMotionXCord());
			MovingQTable.GetQList().get(jj).setTestChargeYCord(TCM.getMotionYCord());
			
			MovingQTable.GetQList().get(jj).setTestChargeVelocityX(TCM.getMotionXVelo());
			MovingQTable.GetQList().get(jj).setTestChargeVelocityY(TCM.getMotionYVelo());
		
			
			
			
			
		
			}
			repaint();
		}
	}
}

	


