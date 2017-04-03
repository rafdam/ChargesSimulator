package model;

import java.util.ArrayList;

public class ChargesPotential extends ChargesList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void SuperPosition (ArrayList<StationaryCharge> l){
	double k = 1;
	int a=1;
	double Potential = 0;
	for (int ii=0; ii<l.size(); ii++){
	Potential =+ (k * l.get(ii).getValue())/(Math.sqrt(a+l.get(ii).getX()*l.get(ii).getX()));
	}
	System.out.println(Potential);
	}
	
	
	public static void main(String[] args) {
	ChargesList List1 = new ChargesList();
	StationaryCharge ch1 = new StationaryCharge(1,2,3,4);
	StationaryCharge ch2 = new StationaryCharge(-1,-5,-2,10);
	List1.add(ch1);
	List1.add(ch2);
	SuperPosition(List1);
	}

}
