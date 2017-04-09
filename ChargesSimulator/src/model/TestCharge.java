package model;
//Author::rafdam


public class TestCharge {
		
		double testChargeVelocityX = 0; 
		double testChargeVelocityY = 0;
		double testChargeVelocityZ = 0;
		double testChargeXCord = 0;
		double testChargeYCord = 0;
		double testChargeZCord = 0;
		double testChargeConstant = 0;
	
	
	
	public double getTestChargeConstant(){
		return testChargeConstant;
	}
	
	public double getTestChargeVelocityX(){
		return testChargeVelocityX;
	}
	
	public double getTestChargeVelocityY(){
		return testChargeVelocityY;
	}
	
	public double getTestChargeVelocityZ(){
		return testChargeVelocityZ;
	}
	
	public TestCharge() {
		// TODO Auto-generated constructor stub
	}
	public TestCharge(boolean a, double b, double c, double d, double e, double f, double g){
			testChargeVelocityX = b; 
			testChargeVelocityY = c;
			testChargeVelocityZ = d;
			testChargeXCord = e;
			testChargeYCord = f;
			testChargeZCord = g;
		
		if (a == false){
			testChargeConstant = -14.592*Math.pow(10,12);
			}
		
		else{
			testChargeConstant = 2.679538842*Math.pow(10,8);
		}
		
	}
	

}