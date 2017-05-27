package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

import model.ChargesList;
import model.ChargesPotential;
import model.TestPoint;

public class HeatMap {
Dimension screenSize;
double a, b;
ArrayList<Integer> heatmap;

	public HeatMap() {
		
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();	
		double x = 0.85 * screenSize.height;
		double y =0.85 * screenSize.height;	
		int z;
		
		
		heatmap = new ArrayList<Integer>();
		
		for(int kk = 0; kk < x ; kk++){
			for ( int ww = 0; ww < y ; ww++){
				TestPoint testP = new TestPoint(kk,ww,0);
				ChargesPotential ch = new ChargesPotential(StationaryQTable.GetChargesList(), testP);
				z =(int)ch.getPotential();
				heatmap.add(z);
			}
		}
		a = Collections.max(heatmap);
		
		
	}
	public double getA(){
		return a;
	}
	public ArrayList<Integer> getHeatMap(){
		return heatmap;
	}
	
	

	

	

	
}


