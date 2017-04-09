package model;

import java.util.ArrayList;

// Author: rafdam
public class CountAll extends TestChargeMotion {

	
	
	public static void main(String[] args) {
		TestPoint testPoint0 = new TestPoint(1, 2, 4);
		ChargesList stationaryChargesList = new ChargesList();
		ArrayList<TestChargeMotion> TestChargeValues = new ArrayList<TestChargeMotion>();
		StationaryCharge st1 = new StationaryCharge (1,2,3,4);
		StationaryCharge st2 = new StationaryCharge(2,3,6,-1);
		stationaryChargesList.add(st1);
		stationaryChargesList.add(st2);
		TestCharge moveableCharge = new TestCharge (false , 2, 0, 0, 0, 0, 0);
		ChargesPotential ch = new ChargesPotential(stationaryChargesList, testPoint0);
		TestChargeMotion tcm = new TestChargeMotion(ch, moveableCharge, 0);
		
		for ( int jj = 0; jj<10; jj++){
			TestPoint testPointJJ = new TestPoint(tcm.getMotionXCord(), tcm.getMotionYCord(), tcm.getMotionZCord());
			ChargesPotential ch1 = new ChargesPotential(stationaryChargesList, testPointJJ);
			TestChargeMotion tcm1 = new TestChargeMotion(ch1, moveableCharge, 0.0000001*jj);
			TestChargeValues.add(tcm1);
		}
	
		for (int ii = 0; ii<10; ii++){
			System.out.println(TestChargeValues.get(ii).getMotionXCord());
			
			}
		}
	}

