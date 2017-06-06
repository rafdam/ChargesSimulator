package model;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;


import gui.StationaryQTable;

public class ChargesPotential extends ChargesList {
	//Author: rafdam
	//Math model calculating potential and electrical force generated by stationary charges
	/**
	 * 
	 */
	static double electricForceX = 0; //derivative dPotential/dx
	static double electricForceY = 0; //derivative dPotential/dy
	
	double Potential = 0; //Potential generated by stationary charges in test point
	private static final long serialVersionUID = 1L;
	double k = 0;
	double xMotionValue = 0; //Moved test x value by stationaryCharge x value
	double yMotionValue = 0; //Moved test y value by stationaryCharge y value
	
	double testCordX = 0; //Coords of testPoint in potential
	double testCordY = 0;
	
	
	
	public double getElectricForceX(){
		return electricForceX;
	}
	
	public double getElectricForceY(){
		return electricForceY;
	}
	
	

	public double getPotential(){
		return Potential;
	}
	
	public double getTestX(){
		return testCordX;
	}
	
	public double getTestY(){
		return testCordY;
	}
	
	
	
	
	
	
	
	
	public ChargesPotential (ArrayList<StationaryCharge> l, TestPoint w){ //Counting Potential and electric Force in given TestPoint
		
	
	k=9*Math.pow(10, 9);
	
	testCordX = w.getTestXCord();
	testCordY = w.getTestYCord();
	
	
	
	for (int ii=0; ii<l.size(); ii++){
		
	
	
	
	
	}
	
	
	double deltaElectricForceX = 0; //Potential(x+ultraSmallH,y,z)
	double deltaElectricForceY = 0; //Potential(x,y+ultraSmallH,z)
	
	
	
	double ultraSmallH = 0.001; //Small constant to derivative Potential
		for (int jj = 0; jj < l.size(); jj++){
			xMotionValue = (-l.get(jj).getX() + w.getTestXCord());
			yMotionValue = (-l.get(jj).getY() + w.getTestYCord());
			
			
				Potential += (k * l.get(jj).getValue()) / (Math.sqrt(Math.pow(yMotionValue,2) + Math.pow(xMotionValue,2)));
			
			
			
				
				
				deltaElectricForceX += (k * l.get(jj).getValue()) / (Math.sqrt(Math.pow(yMotionValue,2) + Math.pow(xMotionValue + ultraSmallH,2) + Math.pow(xMotionValue,2)));
				deltaElectricForceY += (k * l.get(jj).getValue()) / (Math.sqrt(Math.pow(yMotionValue + ultraSmallH,2) + Math.pow(xMotionValue,2) + Math.pow(yMotionValue,2)));
				
		} 
 		electricForceX=(deltaElectricForceX-Potential)/ultraSmallH;//Numerical derivative
		electricForceY=(deltaElectricForceY-Potential)/ultraSmallH;//Numerical derivative

		
	
	}
		
		
	public void draw(Graphics g) { //Drawing Potential- HEATMAP
		
		
		
		try{
			
		Color PotColor = new Color(100, 255, (int)(Potential/(HeatMap.getMaxValue()) * 255)); // Color generated by potential to create HEATMAP
		g.setColor(PotColor);
			
			
		
		}
		catch(IllegalArgumentException e){ //Nested Try-Catches for making rainbowy-circles in heatmap
			try{
			Color PotColor = new Color(255,100, (int)(Potential*0.9/(HeatMap.getMaxValue())*255));
			g.setColor(PotColor);
			}
			catch(IllegalArgumentException a){
				try{
					Color PotColor = new Color(255,100, (int)(Potential*0.75/(HeatMap.getMaxValue())*255));
					g.setColor(PotColor);
					}
				catch(IllegalArgumentException b){
					try{
						Color PotColor = new Color(255,100, (int)(Potential*0.5/(HeatMap.getMaxValue())*255));
						g.setColor(PotColor);
					}
					catch(IllegalArgumentException c){
						try{
							Color PotColor = new Color(255,100, (int)(Potential*0.25/(HeatMap.getMaxValue())*255));
							g.setColor(PotColor);
						}
						catch(IllegalArgumentException d){
							
							try{
								Color PotColor = new Color(255,100, (int)(Potential*0.1/(HeatMap.getMaxValue())*255));
								g.setColor(PotColor);
							}
							catch(IllegalArgumentException f){
								try{
									Color PotColor = new Color(255,100, (int)(Potential*0.04/(HeatMap.getMaxValue())*255));
								g.setColor(PotColor);
									
								}
								catch(IllegalArgumentException p){
									g.setColor(Color.gray);
								}
							}
						}
					}
				}
				
				
		}
		}
	
		
		g.fillOval((int)(testCordX-1), (int)(testCordY-1), 5, 5); // Ovals generating hm
		
		}
}
	
	
	

	
	
	


