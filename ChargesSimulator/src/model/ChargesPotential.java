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
	double Potential = 0;
	for (int ii=0; ii<l.size(); ii++){
	Potential += (k * l.get(ii).getValue())/(Math.sqrt(Math.pow(l.get(ii).getY()-w.getTestYCord(),2)+Math.pow(l.get(ii).getX()-w.getTestXCord(),2)+Math.pow(l.get(ii).getZ()-w.getTestXCord(), 2)));
	}
	System.out.println(Potential);
	
	
	
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
