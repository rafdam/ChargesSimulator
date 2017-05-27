package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import gui.HeatMap;
import gui.StationaryQTable;

//Author: rafdam
public class StationaryCharge {
		
		
		public double getX() {
			return xCord;
		}

		public void setX(double x) {
			xCord = x;
		}

		public  double getY() {
			return yCord;
		}

		public void setY(double y) {
			yCord = y;
		}

		public double getZ() {
			return zCord;
		}

		public void setZ(double z) {
			zCord = z;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}
		
		public double getDistanceFromZero(){
			return distanceFromZero;
		}
		
		double xCord = 0;
		double yCord = 0;
		double zCord = 0;
		double value = 0;
		double distanceFromZero=0;
	
	public StationaryCharge(){
		
	}
	public StationaryCharge(double a, double b, double c, double d) {
		xCord = a;
		yCord = b;
		zCord = c;
		value = d;
		distanceFromZero = Math.sqrt(a*a+b*b+c*c);
		
	}
	public static int DIAMETER = 15;
	
    
	
	
	
	

	public void draw(Graphics g) {
		Color randomColour = new Color(255,255,255);
		g.setColor(randomColour);
		g.fillOval( (int)xCord, (int)yCord, DIAMETER, DIAMETER);
		
	}
	/*Dimension screenSize;
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
			g.fillOval( kk, ww, 1, 1);
			
			
			System.out.println(kk+ww);
			
		}*/

	

	
    
    
   
    
    
	

}
