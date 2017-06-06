package model;
//Author: rafdam
public class TestPoint {
	
	// A class representing a single point in a 2-dimensional space
	// All the calculations are made in the single point, than by recurency we change this point 
	// No true calculations in this class, just a constructor
	public double getTestXCord() {
		return testXCord;
	}

	

	public double getTestYCord() {
		return testYCord;
	}

	

	
		
	double testXCord=0;
	double testYCord=0;
	

	public TestPoint() {
		// TODO Auto-generated constructor stub
	}
	
	public TestPoint(double a, double b){
		testXCord=a;
		testYCord=b;
		
	}
	
	public void TestXCord(double a){
		testXCord=a;
		}
	
	
	
	public void TestYCord(double a){
		testYCord=a;
	}
	

}
