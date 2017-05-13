package gui;
import java.awt.Color;
import java.awt.Dimension; 
//author: Mikolaj Czajka
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

import model.ChargesList;
import model.ChargesPotential;
import model.StationaryCharge;
import model.TestCharge;
import model.TestChargeMotion;
import model.TestPoint;
import net.miginfocom.swing.MigLayout;

//import com.sun.javafx.tk.Toolkit;
//import com.sun.prism.paint.Color;

public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() throws HeadlessException {
		setLayout(new MigLayout());
		setTitle("Charges Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();			
		double leftPanelWidth =screenSize.height;
		double leftPanelHeight =0.6 * screenSize.height;
		Dimension leftPanelDim = new Dimension((int) leftPanelHeight, (int) leftPanelHeight);	
		
		double labelHeight = 0.1 * screenSize.height;
		double lebelWidth = leftPanelHeight;
		Dimension labelDim = new Dimension((int)lebelWidth, (int) labelHeight);
		
		double rightPanelWidth = leftPanelHeight / 2;
		double rightPanelHeight = leftPanelHeight + labelHeight;
		Dimension rightPanelDim = new Dimension((int) rightPanelWidth, (int) rightPanelHeight);
		
		
		LeftMainPanel leftPanel = new LeftMainPanel();
		RightMainPanel rightPanel = new RightMainPanel();
		MainFrameTitleLabel titlelabel = new MainFrameTitleLabel();
		
		
		leftPanel.setPreferredSize(leftPanelDim);
		rightPanel.setPreferredSize(rightPanelDim);	
		titlelabel.setPreferredSize(labelDim);		
		
		add(titlelabel);
		add(rightPanel, "wrap, spany");
		add(leftPanel);		
		pack();	
	}

	
	public static void main(String[] args) {
	MainFrame mFrame = new MainFrame();
	mFrame.setVisible(true);
	mFrame.setResizable(false);
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