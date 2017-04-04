package model;
//Author::rafdam
import java.util.ArrayList;

public class TestCharge {

	
	public TestCharge() {
		// TODO Auto-generated constructor stub
	}
	public TestCharge(boolean a, double b, double c, double d){
		boolean ifTestChargeSignPositive = a;
		double testChargeMass = 0;
		double testChargeVelocityX = b; 
		double testChargeVelocityY = c;
		double testChargeVelocityZ = d;
		
		if (a == false){
			testChargeMass = 9.10938215*Math.pow(10, -31);
			}
		
		else{
			testChargeMass = 1.672621637*Math.pow(10, -27);
		}
		
	}
	

}