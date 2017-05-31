package model;
//Author::rafdam

import java.awt.Color;
import java.awt.Graphics;

public class TestCharge {
		
		double testChargeVelocityX = 0; 
		double testChargeVelocityY = 0;
		double testChargeVelocityZ = 0;
		double testChargeXCord = 0;
		double testChargeYCord = 0;
		double testChargeZCord = 0;
		double testChargeConstant = 0;
	
	
	
	public void setTestChargeVelocityX(double a){
		testChargeVelocityX = a;
	}
	
	public void setTestChargeVelocityY(double b){
		testChargeVelocityY = b;
	}
	
	public void setTestChargeVelocityZ(double c){
		testChargeVelocityZ = c;
	}
	
	public void setTestChargeXCord(double d){
		testChargeXCord = d;
	}
	public void setTestChargeYCord(double e){
		testChargeYCord = e;
	}
	public void setTestChargeZCord(double f){
		testChargeZCord = f;
	}
	
	
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
	
	public double getTestChargeCoordX(){
		return testChargeXCord;
	}
	public double getTestChargeCoordY(){
		return testChargeYCord;
	}
	public double getTestChargeCoordZ(){
		return testChargeZCord;
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
			testChargeConstant = +14.592*Math.pow(10,12);
			}
		
		else{
			testChargeConstant = -2.679538842*Math.pow(10,8);
		}
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillOval( (int)testChargeXCord-10, (int)testChargeYCord-10, 20, 20);
		
	}
	
	
	

}