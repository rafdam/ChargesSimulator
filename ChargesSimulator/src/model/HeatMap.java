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
	static double maxValue = 0;
	ChargesPotential ch;
	TestPoint testP;
	
	
	
	public HeatMap(ChargesList ChL){
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();	
		double x = 0.85 * screenSize.height;
		double y =0.85 * screenSize.height;	
		
		
		
		heatmap = new ArrayList<ChargesPotential>();
		potentialValue = new ArrayList<Double>();
		
		for(int kk = 0; kk < x/4 ; kk++){
			for ( int ww = 0; ww < y/4 ; ww++){
				testP = new TestPoint(4*kk, 4*ww);
				ch = new ChargesPotential(ChL, testP);
				heatmap.add(ch);
				
				
			}
		}
		
		/*testP = new TestPoint(ChL.get(0).getX()+10, ChL.get(0).getY()+10);
		ch = new ChargesPotential(ChL, testP);
		maxValue = ch.getPotential();
		*/
		for( int ii = 0 ; ii < ChL.size(); ii++){
			testP = new TestPoint(ChL.get(ii).getX()+2, ChL.get(ii).getY()+2);
			ch = new ChargesPotential(ChL, testP);
			potentialValue.add(ch.getPotential());
			maxValue = Collections.max(potentialValue);
		}
		
		
		/*if(Collections.max(potentialValue) > Math.pow(10, -8)){
			maxValue = Math.pow(10, -8);
		}
		else{
		maxValue = Collections.max(potentialValue);
		}
		*/
		
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
