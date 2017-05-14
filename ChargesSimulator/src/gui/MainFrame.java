package gui;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.ChargesList;
import model.ChargesPotential;
import model.StationaryCharge;
import model.TestCharge;
import model.TestChargeMotion;
import model.TestPoint;
import net.miginfocom.swing.MigLayout;

//import com.sun.javafx.tk.Toolkit;
//import com.sun.prism.paint.Color;
// START WORKING U PIECE OF LOVELY COMPILER


public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dimension screenSize, leftPanelDim, labelDim, rightPanelDim;
	static Dimension addFrameDim; 
	static LeftMainPanel leftPanel;
	public static BufferedImage image;
	
	public MainFrame() throws HeadlessException {
		setLayout(new MigLayout());
		setTitle("Charges Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		 screenSize = Toolkit.getDefaultToolkit().getScreenSize();			
		//double leftPanelWidth =screenSize.height; unused by now
		double leftPanelHeight =0.6 * screenSize.height;
		 leftPanelDim = new Dimension((int) leftPanelHeight, (int) leftPanelHeight);	
		
		double labelHeight = 0.1 * screenSize.height;
		double lebelWidth = leftPanelHeight;
		 labelDim = new Dimension((int)lebelWidth, (int) labelHeight);
		
		double rightPanelWidth = leftPanelHeight / 2;		
		double rightPanelHeight = leftPanelHeight + labelHeight;
		rightPanelDim = new Dimension((int) rightPanelWidth, (int) rightPanelHeight);	
		
		double addFrameHeight = 0.2 * rightPanelHeight;
		double addFrameWidth = 0.9 * rightPanelWidth;
		addFrameDim = new Dimension((int) addFrameWidth, (int) addFrameHeight);
	
		
		
		
		 leftPanel = new LeftMainPanel();
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

	static Dimension getAddFrameDim(){
		return addFrameDim;
	}
	
	 public static void AddStationaryQ(StationaryCharge SCh){
		 //Graphics2D g2 = (Graphics2D) g;
		 
		 	JLabel label = new JLabel();
			System.out.println("dodaje wartości xD"+SCh.getX()+SCh.getY()+SCh.getZ());
		
			label.setText(Double.toString(SCh.getValue()));
			label.setVisible(true);
			label.setBounds((int)SCh.getX(), (int)SCh.getY(), 30, 30);
			leftPanel.add(label);
			leftPanel.repaint();      
			
		//	SCh.DrawStationaryQ(g);
	 }
	               
	
	
	
	public static void main(String[] args) {
	MainFrame mFrame = new MainFrame();
	mFrame.setVisible(true);
	mFrame.setResizable(false);
	ChargesList stationaryChargesList = new ChargesList();
	/*TestPoint testPoint0 = new TestPoint(1, 2, 4);
	
	*ArrayList<TestChargeMotion> TestChargeValues = new ArrayList<TestChargeMotion>();
	*
	*
	*TestCharge moveableCharge = new TestCharge (false , 2, 0, 0, 0, 0, 0);
	*ChargesPotential ch = new ChargesPotential(stationaryChargesList, testPoint0);
	*TestChargeMotion tcm = new TestChargeMotion(ch, moveableCharge, 0);
	*
	*for ( int jj = 0; jj<10; jj++){
	*	TestPoint testPointJJ = new TestPoint(tcm.getMotionXCord(), tcm.getMotionYCord(), tcm.getMotionZCord());
	*	ChargesPotential ch1 = new ChargesPotential(stationaryChargesList, testPointJJ);
	*	TestChargeMotion tcm1 = new TestChargeMotion(ch1, moveableCharge, 0.0000001*jj);
	*	TestChargeValues.add(tcm1);
	*}
	*
	*for (int ii = 0; ii<10; ii++){
	*	System.out.println(TestChargeValues.get(ii).getMotionXCord());
	*	
	*	}
	*
	*/
	}
	

}
