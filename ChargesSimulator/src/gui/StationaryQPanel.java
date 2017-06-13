package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
		
		JLabel label = new JLabel("Stationary Charges");
		StationaryQInPanel inPanel = new StationaryQInPanel();		
		StationaryQAddButton addButton = new StationaryQAddButton();
		StationaryQEditButton editButton = new StationaryQEditButton();
		StationaryQDeleteButton deleteButton = new StationaryQDeleteButton();
		StationaryQDeployButton deployButton = new StationaryQDeployButton();
		
		addButton.setToolTipText("Add new stationary charge to table.");
		editButton.setToolTipText("Edit a selected (mouse click) charge from table.");
		deleteButton.setToolTipText("Delete a selected (mouse click) charge from table.");
		deployButton.setToolTipText("Put or take a charge from panel.");
		
		
		
		
		
		
		
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		HMdeployButton = new HeatMapDeployButton();
		ItemListener al1 = new ItemListener(){

			
			
					/*
				 public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					HM = new HeatMap(StationaryQTable.GetChargesList());
					MainFrame.leftPanel.repaint();
				}
				 	*/
			
			
			
		public void itemStateChanged(ItemEvent arg0) {				
				HM = new HeatMap(StationaryQTable.GetChargesList());
				MainFrame.leftPanel.repaint();
			}			
		};
		
		
		HMdeployButton.addItemListener(al1);
		
		add(label, "width 100%, height 3%, span, wrap");
		add(inPanel,"width 100%, height 77%, span");
		add(addButton,"width 33%, height 10%");
		add(editButton,"width 33%, height 10%");
		add(deleteButton,"wrap, width 33%, height 10%");
		add(deployButton,"width 33%, height 10%, span, split 2");
		add(HMdeployButton,"width 66%, height 10%, span, wrap, align center ");
	}

}
