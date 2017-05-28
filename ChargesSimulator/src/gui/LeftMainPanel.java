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
import model.StationaryCharge;
import model.TestCharge;
import model.TestChargeMotion;
import model.TestChargesList;
import model.TestPoint;
//author: Czajka
//PANEL WITH DISPLAYED CHARGES
public class LeftMainPanel extends JPanel{

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	int interval = 20;
	static Timer timer;
	
	
	
	
	
	
	
	public LeftMainPanel() { 	
		//setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setLayout(null);
		timer = new Timer(interval, new TimerAction());		
		
		
		}
	
	
	public static void setAnimation(boolean turnOnOff){
		if(turnOnOff){
			timer.start();
		}
		else{
			timer.stop();
		}
	}
	public static void draw(Graphics g){
	Dimension screenSize;
	HeatMap HM = new HeatMap();
	double z;
	double v = HM.getA();
	screenSize = Toolkit.getDefaultToolkit().getScreenSize();	
	for(int kk = 0; kk < 0.85 * screenSize.height; kk++){
		for ( int ww = 0; ww < 0.85 * screenSize.height; ww++){
			TestPoint testP = new TestPoint(kk,ww,0);
			ChargesPotential ch = new ChargesPotential(StationaryQTable.GetChargesList(), testP);
			z = ch.getPotential();
			int RGB = (int)(v/z);
			Color randomColour = new Color(RGB,255,255);
			g.setColor(randomColour); 
			g.fillOval( kk, ww, 2, 2);
			//System.out.println(z);
			
			
			
			
		
	}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	
		
		
		
        for(int i = 0; i < StationaryQTable.GetChargesList().size(); i++){
        StationaryQTable.GetChargesList().get(i).draw(g);
        	}
        for(int j = 0; j < MovingQTable.GetQList().size(); j++){
        	MovingQTable.GetQList().get(j).draw(g);
        }
        
        
        	
        	
		}
	
	
	
	
	
	class TimerAction implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			for(int jj = 0 ; jj < MovingQTable.GetQList().size(); jj++){
				TestPoint testPoint = new TestPoint(MovingQTable.GetQList().get(jj).getTestChargeCoordX(), MovingQTable.GetQList().get(jj).getTestChargeCoordY(), MovingQTable.GetQList().get(jj).getTestChargeCoordZ());
				
						
			ChargesPotential ch = new ChargesPotential(StationaryQTable.GetChargesList(), testPoint);
			TestChargeMotion TCM = new TestChargeMotion(ch ,MovingQTable.GetQList().get(jj), (double)interval/1000);
			MovingQTable.GetQList().get(jj).setTestChargeXCord(TCM.getMotionXCord());
			MovingQTable.GetQList().get(jj).setTestChargeYCord(TCM.getMotionYCord());
			MovingQTable.GetQList().get(jj).setTestChargeZCord(TCM.getMotionZCord());
			MovingQTable.GetQList().get(jj).setTestChargeVelocityX(TCM.getMotionXVelo());
			MovingQTable.GetQList().get(jj).setTestChargeVelocityY(TCM.getMotionYVelo());
			MovingQTable.GetQList().get(jj).setTestChargeVelocityZ(TCM.getMotionZVelo());
			
			
			
			
		
			}
			repaint();
		}
	}
}

	


