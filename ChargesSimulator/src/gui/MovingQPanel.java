package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;


//author:Czajka
//Panel of moving charges

public class MovingQPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// defining animation buttons
	static JButton startButton;
	static JButton stopButton; 


	public MovingQPanel() {	
		setLayout(new MigLayout("", "[] [] [] [] []","[] [] [] []"));
		setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.BLACK, 3));
		
		//creating animation buttons
		startButton = new JButton("Start Animation");
		stopButton = new JButton("Stop Animation");
		
		JLabel label = new JLabel("Moving Charges");
		MovingQInPanel inPanel = new MovingQInPanel(); //contain table of charges		
		MovingQAddButton addButton = new MovingQAddButton();
		MovingQEditButton editButton = new MovingQEditButton();
		MovingQDeleteButton deleteButton = new MovingQDeleteButton();
		MovingQDeployButton deployButton = new MovingQDeployButton();
		
		addButton.setToolTipText("Add new moving charge to table.");
		editButton.setToolTipText("Edit a selected (mouse click) charge from table.");
		deleteButton.setToolTipText("Delete a selected (mouse click) charge from table.");
		deployButton.setToolTipText("Put or take a charge from panel.");		
		startButton.setToolTipText("Start animation of moving charges.");
		stopButton.setToolTipText("Stop animation of moving charges.");
		
		
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		
		
		
		
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
		
		add(label, "width 100%, height 3%, span, wrap");
		add(inPanel,"width 100%, height 75%, span");
		add(addButton,"width 33%, height 8%");
		add(editButton,"width 33%, height 8%");
		add(deleteButton,"width 33%, height 8%,wrap");
		add(deployButton,"width 33%, height 8%,align center");	
		add(startButton,"width 33%, height 8%");
		add(stopButton,"width 33%, height 8%");
		
		
		
					
	}
}
