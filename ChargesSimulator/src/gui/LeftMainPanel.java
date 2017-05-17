package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.geom.Ellipse2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import model.StationaryCharge;
import model.TestCharge;
//author: Czajka
//PANEL WITH DISPLAYED CHARGES
public class LeftMainPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LeftMainPanel() { 	
		//setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setLayout(null);
		}
	
	
	
	
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < StationaryQTable.GetChargesList().size(); i++){
        StationaryQTable.GetChargesList().get(i).draw(g);
        	}
        	
        	
		}
	
	
	

    
	

	
	
	
	

	





	public LeftMainPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public LeftMainPanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public LeftMainPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
/*
	public void DrawStationaryQ(Graphics g) {
		// TODO Auto-generated method stub

	}	*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
