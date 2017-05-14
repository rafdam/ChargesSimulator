package gui;

import java.awt.Graphics;

import model.ChargesList;

public interface StationaryQInterface {
int DIAMETER = 0;
    
    
    int qX=0;           
    int qY=0;
    int qZ=0;
    
    public void DrawStationaryQ(Graphics g);
    ChargesList stationaryChargesList = new ChargesList();

}
