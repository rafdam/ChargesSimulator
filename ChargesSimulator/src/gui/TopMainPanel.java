package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import model.HeatMap;
import net.miginfocom.swing.MigLayout;

public class TopMainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4163362475437360265L;
	HeatMap HM;
	
	public TopMainPanel() {
	setLayout(new MigLayout("","[] []", "[] []"));
	
	MainFrameTitleLabel Title = new MainFrameTitleLabel();
	TimerStartButton startButton = new TimerStartButton();
	TimerStopButton stopButton = new TimerStopButton();
	
	
	add(Title,"width 100%, height 50%, span,wrap");
	add(startButton,"align right, width 50%, height 20%");
	add(stopButton,"center, width 50%, height 20%");
	}
	
	
	
	
	public TopMainPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TopMainPanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TopMainPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
