package model;
//Author: rafdam
public class TestPoint {
	public double getTestXCord() {
		return testXCord;
	}

	public void setTestXCord(double testXCord) {
		TestPoint.testXCord = testXCord;
	}

	public double getTestYCord() {
		return testYCord;
	}

	public void setTestYCord(double testYCord) {
		TestPoint.testYCord = testYCord;
	}

	public double getTestZCord() {
		return testZCord;
	}

	public void setTestZCord(double testZCord) {
		TestPoint.testZCord = testZCord;
	}
		
	static double testXCord=0;
	static double testYCord=0;
	static double testZCord=0;

	public TestPoint() {
		// TODO Auto-generated constructor stub
	}
	
	public TestPoint(double a, double b, double c){
		testXCord=a;
		testYCord=b;
		testZCord=c;
	}
	
	public void TestXCord(double a){
		testXCord=a;
		}
	
	public void TestZCord(double a){
		testZCord=a;
	}
	
	public void TestYCord(double a){
		testYCord=a;
	}
	

}
