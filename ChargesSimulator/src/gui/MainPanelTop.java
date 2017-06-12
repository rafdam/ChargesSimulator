package gui;

import java.awt.Color; 
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import model.HeatMap;
import net.miginfocom.swing.MigLayout;

public class MainPanelTop extends JPanel {
	
	//Author: Czajka & rafdam
	//Panel with title and timer buttons

	/**
	 * 
	 */
	private static final long serialVersionUID = 4163362475437360265L;
	
	// defining animation buttons
	static JButton startButton;
	static JButton stopButton; 

	
	
	public MainPanelTop() {
		
	setLayout(new MigLayout("","[] []", "[] []"));	
	MainFrameTitleLabel Title = new MainFrameTitleLabel();
	
	//creating animation buttons
	startButton = new JButton("START");
	stopButton = new JButton("STOP");
	
	stopButton.setEnabled(false);
	
	
	
	// action listeners to start and stop animation
	ActionListener start = new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
		startButton.setEnabled(false);
		stopButton.setEnabled(true);
		MainPanelLeft.setAnimation(true);   //running animation
		//StationaryQPanel.HMdeployButton.setEnabled(false);//Unabling to draw heatmap			
		}
	};
	startButton.addActionListener(start);
	
	
	
	
	ActionListener stop = new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			MainPanelLeft.setAnimation(false);
			startButton.setEnabled(true);
			stopButton.setEnabled(false);
			//StationaryQPanel.HMdeployButton.setEnabled(true);//abling to draw heatmap	
			}		
	};
	stopButton.addActionListener(stop);
	
	
	
	add(Title,"width 100%, height 50%, span,wrap");
	add(startButton,"align right, width 50%, height 20%");
	add(stopButton,"center, width 50%, height 20%");
	}
	
	
	
	

}
