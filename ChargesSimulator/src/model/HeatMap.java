package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

import gui.StationaryQTable;

public class HeatMap {
	//author: rafdam
	//Counting potential in almost every point on the drawing panel ( 1 point per 4 pixels )
	//And putting it to arraylist which gonna be later painted on that panel
	Dimension screenSize;
	double a, b;
	static ArrayList<ChargesPotential> heatmap;
	ArrayList<Double> potentialValue;
	static double maxValue = 0;
	ChargesPotential ch;
	TestPoint testP;
	
	
	
	public HeatMap(ChargesList ChL){
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();	
		double x = 0.85 * screenSize.height;//Getting scaled screen size - size of drawing panel
		double y =0.85 * screenSize.height;	
		
		
		
		heatmap = new ArrayList<ChargesPotential>();//Arraylist of objects
		potentialValue = new ArrayList<Double>(); // arrayList created to get "maximal" value of potential to properly get RGB scaling 
		
		for(int kk = 0; kk < x/4 ; kk++){
			for ( int ww = 0; ww < y/4 ; ww++){
				testP = new TestPoint(4*kk, 4*ww);
				ch = new ChargesPotential(ChL, testP);
				heatmap.add(ch);
				
				
			}
		}
		
		
		for( int ii = 0 ; ii < ChL.size(); ii++){
			testP = new TestPoint(ChL.get(ii).getX()+350, ChL.get(ii).getY()+350);
			ch = new ChargesPotential(ChL, testP);
			potentialValue.add(ch.getPotential());
			maxValue = Collections.max(potentialValue); // getting "max" value of potential
		}
		
		
		
		
		System.out.println(maxValue);
		
	}
	
	public static double getMaxValue(){
		return maxValue;
	}
	
	public static ArrayList<ChargesPotential> getHeatMap(){
		return heatmap;
	}
	
	public double GetMaxValue(){
		return maxValue;
	}
	
	

}
