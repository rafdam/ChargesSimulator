package model;
//Author::rafdam

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class TestCharge {
		//Class defining test charge which can be either electron or proton
		//The charge must be defined by x/y coords and velocity
		
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
	public TestCharge(boolean a, double b, double c, double e, double f){ // main constructor of the test charge, must be fully completed
			// boolean a is decision which charge is it ( electron or proton )
			testChargeVelocityX = b; 
			testChargeVelocityY = c;
		
			testChargeXCord = e;
			testChargeYCord = f;
			
		
		if (a == false){
			testChargeConstant = +14.592*Math.pow(10,12); // constant variable of electron combined by mass and value
			}
		
		else{
			testChargeConstant = -2.679538842*Math.pow(10,8); // constant variable of proton combined by mass and value
		} 
		
	}
	public void draw(Graphics g) { // drawing black circle as a representation of moving charge 
				
		if (testChargeConstant < 0){g.setColor(Color.red);}
		else{g.setColor(Color.blue);}		
		g.fillOval( (int)(testChargeXCord-10), (int)(testChargeYCord-10), 20, 20);
		
	}
	
	
	

}