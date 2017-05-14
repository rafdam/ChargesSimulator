package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import model.StationaryCharge;

public class LeftMainPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LeftMainPanel() {	
		//setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
			}
	
	public void paintComponent(Graphics g, StationaryCharge a) {
        super.paintComponent(g);  
       
    		a.DrawStationaryQ(g);
        
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

	public void DrawStationaryQ(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
