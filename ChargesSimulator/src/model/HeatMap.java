package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

import gui.StationaryQTable;

public class HeatMap {
	Dimension screenSize;
	double a, b;
	static ArrayList<ChargesPotential> heatmap;
	ArrayList<Double> potentialValue;
	double maxValue = 0;
	double changeColor = 0;
	
	
	public HeatMap(ChargesList ChL){
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();	
		double x = 0.85 * screenSize.height;
		double y =0.85 * screenSize.height;	
		
		
		
		heatmap = new ArrayList<ChargesPotential>();
		potentialValue = new ArrayList<Double>();
		
		for(int kk = 0; kk < x ; kk++){
			for ( int ww = 0; ww < y ; ww++){
				TestPoint testP = new TestPoint(kk,ww,0);
				ChargesPotential ch = new ChargesPotential(ChL, testP);
				heatmap.add(ch);
				potentialValue.add(ch.getPotential());
					
			}
		}
		maxValue = Collections.max(potentialValue);
		System.out.println(maxValue);
	}
	
	public double getMaxValue(){
		return maxValue;
	}
	
	public static ArrayList<ChargesPotential> getHeatMap(){
		return heatmap;
	}
	
	public double GetMaxValue(){
		return maxValue;
	}
	
	

}
