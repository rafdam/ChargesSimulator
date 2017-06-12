package gui;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import model.HeatMap;
import net.miginfocom.swing.MigLayout;

//author:Czajka
//Panel cointains components of stationary charges (table and buttons)

public class StationaryQPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	HeatMap HM;
	static HeatMapDeployButton HMdeployButton;
	
	public StationaryQPanel() {
		setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
		setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.BLACK, 3));		
		
		StationaryQLabel label = new StationaryQLabel();
		StationaryQInPanel inPanel = new StationaryQInPanel();
		
		StationaryQAddButton addButton = new StationaryQAddButton();
		StationaryQEditButton editButton = new StationaryQEditButton();
		StationaryQDeleteButton deleteButton = new StationaryQDeleteButton();
		StationaryQDeployButton deployButton = new StationaryQDeployButton();
		HMdeployButton = new HeatMapDeployButton();
		ItemListener al1 = new ItemListener(){

			/*public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HM = new HeatMap(StationaryQTable.GetChargesList());
				MainFrame.leftPanel.repaint();
			}
*/
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				HM = new HeatMap(StationaryQTable.GetChargesList());
				MainFrame.leftPanel.repaint();
			}
			
		};
		HMdeployButton.addItemListener(al1);
		
		add(label, "width 100%, height 5%, span, wrap");
		add(inPanel,"width 100%, height 75%, span");
		add(addButton,"width 33%, height 10%");
		add(editButton,"width 33%, height 10%");
		add(deleteButton,"wrap, width 33%, height 10%");
		add(deployButton,"width 50%, height 10%, span, wrap, align center");
		add(HMdeployButton,"width 20%, height 10%, span, wrap, align center ");
	}

	public StationaryQPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public StationaryQPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public StationaryQPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
