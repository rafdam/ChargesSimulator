package model;
//Author: rafdam

import java.util.ArrayList;

public interface ChargesPotentialInterface {
	static double electricForceX = 0; //derivative dPotential/dx
	static double electricForceY = 0; //derivative dPotential/dy
	static double electricForceZ = 0; //derivative dPotential/dz
	
	
	public double getElectricForceX();
	
	public double getElectricForceY();
	
	public double getElectricForceZ();
	
	public void ChargesPotential (ArrayList<StationaryCharge> l, TestPoint w);

}
