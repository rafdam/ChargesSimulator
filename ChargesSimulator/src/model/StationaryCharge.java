package model;

import java.awt.Graphics;

//Author: rafdam
public class StationaryCharge extends TestPoint {
		
		
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
	public static int DIAMETER = 50;
	
    
	
	
	
	

	public void draw(Graphics g) {
		g.fillOval( (int)xCord, (int)yCord, DIAMETER, DIAMETER);
		
	}

	

	
    
    
   
    
    
	

}
