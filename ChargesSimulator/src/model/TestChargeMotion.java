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

	//TestPullcomment


	public double getElectricForceY() {
		// TODO Auto-generated method stub
		return 0;
	}



	public double getElectricForceZ() {
		// TODO Auto-generated method stub
		return 0;
	}
	
		double motionXCord = 0;
		double motionYCord = 0;
		double motionZCord = 0;
		double motionXVelo = 0;
		double motionYVelo = 0;
		double motionZVelo = 0;
		
	public TestChargeMotion(ChargesPotential ch, TestCharge test1, double t ){
		motionXVelo = ch.getElectricForceX() * test1.getTestChargeConstant() * t + test1.getTestChargeVelocityX();
		motionYVelo = ch.getElectricForceY() * test1.getTestChargeConstant() * t + test1.getTestChargeVelocityY();
		motionZVelo = ch.getElectricForceZ() * test1.getTestChargeConstant() * t + test1.getTestChargeVelocityZ();
		motionXCord = ch.getElectricForceX() * test1.getTestChargeConstant() * Math.pow(t, 2) + test1.getTestChargeVelocityX()*t + test1.testChargeXCord;
		motionYCord = ch.getElectricForceY() * test1.getTestChargeConstant() * Math.pow(t, 2) + test1.getTestChargeVelocityY()*t;
		motionZCord = ch.getElectricForceZ() * test1.getTestChargeConstant() * Math.pow(t, 2) + test1.getTestChargeVelocityZ()*t;
		}
	
	public double getMotionXVelo(){
		return motionXVelo;
	}
	
	public double getMotionYVelo(){
		return motionYVelo;
	}
	
	public double getMotionZVelo(){
		return motionZVelo;
	}
	
	public double getMotionXCord(){
		return motionXCord;
	}
	
	public double getMotionYCord(){
		return motionYCord;
	}
	
	public double getMotionZCord(){
		return motionZCord;
	}
	
	public static void main(String[] args) {
	ChargesList List = new ChargesList();
	TestPoint Point = new TestPoint(3,2,8);
	TestCharge tCharge1 = new TestCharge(true , 0 , 0 , 0 );
	TestCharge tCharge2 = new TestCharge(false , 0 , 0 , 0 );
	StationaryCharge ch1 = new StationaryCharge(1,2,3,-4);
	StationaryCharge ch2 = new StationaryCharge(5,10,3,8);
	StationaryCharge ch3 = new StationaryCharge(8,2,5,10);
	List.add(ch1);
	List.add(ch2);
	List.add(ch3);	
	ChargesPotential Potential = new ChargesPotential(List, Point);
	//System.out.println(Potential.getElectricForceX());
	//System.out.println(Potential.getElectricForceY());
	//System.out.println(Potential.getElectricForceZ());
	TestChargeMotion chargeMotion = new TestChargeMotion(Potential, tCharge1, 0.001);
	TestChargeMotion chargeMotion1 = new TestChargeMotion(Potential, tCharge2, 0.001);
	System.out.println(Potential.getElectricForceX());
	System.out.println(chargeMotion.getMotionXCord());
	System.out.println(chargeMotion1.getMotionXCord());
	System.out.println(tCharge1.getTestChargeConstant());
	System.out.println(tCharge2.getTestChargeConstant());
	}
}
