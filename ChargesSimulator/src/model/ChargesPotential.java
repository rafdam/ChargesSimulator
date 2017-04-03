package model;
//Author: rafdam
import java.util.ArrayList;

public class ChargesPotential extends ChargesList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void SuperPosition (ArrayList<StationaryCharge> l, TestPoint w){
	double k = 1;
	double xMotionValue = 0;
	double yMotionValue = 0;
	double zMotionValue = 0;
	double Potential = 0;
	for (int ii=0; ii<l.size(); ii++){
	xMotionValue=-l.get(ii).getX()+w.getTestXCord();
	yMotionValue=-l.get(ii).getY()+w.getTestYCord();
	zMotionValue=-l.get(ii).getZ()+w.getTestZCord();
	Potential += (k * l.get(ii).getValue())/(Math.sqrt(Math.pow(yMotionValue,2)+Math.pow(xMotionValue,2)+Math.pow(zMotionValue,2)));
	}
	System.out.println(Potential);
	
	double electricForceX = 0;
	double electricForceY = 0;
	double electricForceZ = 0;
	double deltaElectricForceX = 0;
	double deltaElectricForceY= 0;
	double deltaElectricForceZ = 0;
	
	
	double ultraSmallH = 0.0001;
		for (int jj = 0; jj < 3; jj++){
			xMotionValue=-l.get(jj).getX()+w.getTestXCord();
			yMotionValue=-l.get(jj).getY()+w.getTestYCord();
			zMotionValue=-l.get(jj).getZ()+w.getTestZCord();
				
				deltaElectricForceX += (k * l.get(jj).getValue())/(Math.sqrt(Math.pow(yMotionValue,2)+Math.pow(xMotionValue + ultraSmallH,2)+Math.pow(zMotionValue,2)));
				deltaElectricForceY += (k * l.get(jj).getValue())/(Math.sqrt(Math.pow(yMotionValue + ultraSmallH,2)+Math.pow(xMotionValue,2)+Math.pow(zMotionValue,2)));
				deltaElectricForceZ += (k * l.get(jj).getValue())/(Math.sqrt(Math.pow(yMotionValue,2)+Math.pow(xMotionValue,2)+Math.pow(zMotionValue + ultraSmallH,2)));
		}
		electricForceX=(deltaElectricForceX-Potential)/ultraSmallH;
		electricForceY=(deltaElectricForceY-Potential)/ultraSmallH;
		electricForceZ=(deltaElectricForceZ-Potential)/ultraSmallH;
		System.out.println(electricForceX);
		System.out.println(electricForceY);
		System.out.println(electricForceZ);
	
	
	}
	
	
	
	public static void main(String[] args) {
	ChargesList List1 = new ChargesList();
	TestPoint t1 = new TestPoint(4,9,1);
	StationaryCharge ch1 = new StationaryCharge(1,2,3,-4);
	StationaryCharge ch2 = new StationaryCharge(5,10,3,8);
	StationaryCharge ch3 = new StationaryCharge(8,2,5,10);
	
	List1.add(ch1);
	List1.add(ch2);
	List1.add(ch3);
	SuperPosition(List1,t1);
	}

}
