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

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
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
	//mFrame.setResizable(false);
	

	}

}
