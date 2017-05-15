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
		return electricForceX;
		}

	//TestPullcomment


	public double getElectricForceY() {
		// TODO Auto-generated method stub
		return electricForceY;
	}



	public double getElectricForceZ() {
		// TODO Auto-generated method stub
		return electricForceZ;
	}
	
		double motionXCord = 0;
		double motionYCord = 0;
		double motionZCord = 0;
		double motionXVelo = 0;
		double motionYVelo = 0;
		double motionZVelo = 0;
		
	public TestChargeMotion(){
		motionXVelo = 0;
		motionYVelo = 0;
		motionZVelo = 0;
		motionXCord = 0;
		motionYCord = 0;
		motionZCord = 0;
	}
		
	public TestChargeMotion(ChargesPotential ch, TestCharge test1, double t ){
		motionXVelo = ch.getElectricForceX() * test1.getTestChargeConstant() * t + test1.getTestChargeVelocityX();
		motionYVelo = ch.getElectricForceY() * test1.getTestChargeConstant() * t + test1.getTestChargeVelocityY();
		motionZVelo = ch.getElectricForceZ() * test1.getTestChargeConstant() * t + test1.getTestChargeVelocityZ();
		motionXCord = ch.getElectricForceX() * test1.getTestChargeConstant() * Math.pow(t, 2) + test1.getTestChargeVelocityX()*t + test1.testChargeXCord;
		motionYCord = ch.getElectricForceY() * test1.getTestChargeConstant() * Math.pow(t, 2) + test1.getTestChargeVelocityY()*t + test1.testChargeYCord;
		motionZCord = ch.getElectricForceZ() * test1.getTestChargeConstant() * Math.pow(t, 2) + test1.getTestChargeVelocityZ()*t + test1.testChargeZCord;
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
	
	
}
