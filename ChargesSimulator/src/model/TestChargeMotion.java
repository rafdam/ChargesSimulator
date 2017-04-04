package model;
//Author: rafdam
import java.util.ArrayList;

public class TestChargeMotion extends TestCharge implements ChargesPotentialInterface{

	public TestChargeMotion(ArrayList<StationaryCharge> l, TestPoint w) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void ChargesPotential(ArrayList<StationaryCharge> l, TestPoint w) {
		// TODO Auto-generated method stub
		
	}
	public double getElectricForceX() {
		// TODO Auto-generated method stub
		return 0;
		}



	public double getElectricForceY() {
		// TODO Auto-generated method stub
		return 0;
	}



	public double getElectricForceZ() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void Motion(ChargesPotential ch, TestCharge test1 ){
		/*
		 * Space for solving the F=ma equation
		 */
	}
	
	public static void main(String[] args) {
	ChargesList List = new ChargesList();
	TestPoint Point = new TestPoint(3,2,8);
	StationaryCharge ch1 = new StationaryCharge(1,2,3,-4);
	StationaryCharge ch2 = new StationaryCharge(5,10,3,8);
	StationaryCharge ch3 = new StationaryCharge(8,2,5,10);
	List.add(ch1);
	List.add(ch2);
	List.add(ch3);	
	ChargesPotential Potential = new ChargesPotential(List, Point);
	System.out.println(Potential.getElectricForceX());
	System.out.println(Potential.getElectricForceY());
	System.out.println(Potential.getElectricForceZ());

	}
}
