package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import model.ChargesList;
import model.ChargesPotential;
import model.StationaryCharge;
import model.TestCharge;
import model.TestChargeMotion;
import model.TestPoint;
import net.miginfocom.swing.MigLayout;

//import com.sun.javafx.tk.Toolkit;
//import com.sun.prism.paint.Color;
// author: Mikolaj Czajka


public class MainFrame extends JFrame {
	/**
 * 
 */
private static final long serialVersionUID = 1L;
Dimension screenSize, leftPanelDim, labelDim, rightPanelDim; //definition of dimension of panels in main frame
static Dimension addFrameDim; //dimension for small frame "adding charges"
TopMainPanel topPanel;
static LeftMainPanel leftPanel; 	   	//panel where chares are display
public static BufferedImage image;	    //image of charge





public MainFrame() throws HeadlessException {
	
	setLayout(new MigLayout());
	setTitle("Charges Simulator");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	
	
	// SETTING SIZE OF MAIN FRAME //////////////////////////////////////////////////////////
	
	 screenSize = Toolkit.getDefaultToolkit().getScreenSize();			
	//double leftPanelWidth =screenSize.height; unused by now
	double leftPanelHeight =0.85 * screenSize.height;
	 leftPanelDim = new Dimension((int) (leftPanelHeight * 1) , (int) (leftPanelHeight));	
	
	double labelHeight = 0.15 * screenSize.height;
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
	//MainFrameTitleLabel titlelabel = new MainFrameTitleLabel();
	
	topPanel = new TopMainPanel();
	
	
	leftPanel.setPreferredSize(leftPanelDim);	//left panel will be always a square
	rightPanel.setPreferredSize(rightPanelDim);	
	topPanel.setPreferredSize(labelDim);
	
	

	
	// ADDING ELEMENTS OF MAIN FRAME ////////////////////////////////////////////////////////////
	
	add(topPanel);
	add(rightPanel, "wrap, spany");
	add(leftPanel);		
	pack();	
}

static Dimension getAddFrameDim(){ 	//dimension of small frames - adding and deleting charges
		return addFrameDim;
	}
	

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 public static void AddStationaryQ(StationaryCharge SCh){ 	
		 
		 	JLabel label = new JLabel();
			label.setVisible(false);
			leftPanel.repaint();      
			label.setToolTipText(Double.toString(SCh.getValue()));
			
	 }
			
				
				
			
	 
	 
	 
	 
	 public static void ChangeStationaryQ(StationaryCharge SCh){
		 	leftPanel.repaint();
	 }
	 
	 
	 public static void AddMovingQ(TestCharge TCh){
		 leftPanel.repaint();
	 }
	 
	
	 
	               
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
	MainFrame mFrame = new MainFrame();
	mFrame.setVisible(true);
	mFrame.setResizable(false);
	
	

	}
}
