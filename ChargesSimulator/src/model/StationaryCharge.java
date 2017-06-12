package model;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

import gui.MainFrame;
import gui.StationaryQTable;

public class StationaryCharge {
		//Author: rafdam
		//Class defining basic object which is stationary charge generating electric field and potential
	
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

	

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}
		
		public double getDistanceFromZero(){
			return distanceFromZero;
		}
		
		double xCord = 0; // Coordinates ( 1m = 1pix)
		double yCord = 0;
		double value = 0; // charge value in coulombs
		double distanceFromZero=0; //r vector
	
	public StationaryCharge(){
		
	}
	public StationaryCharge(double a, double b, double d) {
		xCord = a;
		yCord = b;
		
		value = d;
		distanceFromZero = Math.sqrt(a*a+b*b);
		
	}
	public static int DIAMETER = 32;
	
    
	
	
	
	

	public void draw(Graphics g) { // drawing a stationary charge as a pink oval (moved x/y oval coords are centering the oval to the right place)
	
		//g.setColor(Color.PINK);
		//g.fillOval((int)(xCord-8), (int)(yCord-8), DIAMETER, DIAMETER);
		
		ImageIcon imgIcon = new ImageIcon();
		if(value > 0){imgIcon = new ImageIcon("Images/positive.png");}
		else if(value < 0){imgIcon = new ImageIcon("Images/negative.png");}
		else{imgIcon = new ImageIcon("Images/neutral.png");}
		Image img = imgIcon.getImage();
		g.drawImage(img, (int)(xCord-16), (int)(yCord-16), DIAMETER, DIAMETER, null);
		
	}
	

	

	
    
    
   
    
    
	

}
