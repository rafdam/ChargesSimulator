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
		
		double frameWidth =screenSize.height;
		double frameHeight =0.7 * screenSize.height;
		
		Dimension frameDim = new Dimension((int) frameWidth, (int) frameHeight);		
		setSize(frameDim);	
		
		LeftMainPanel leftPanel = new LeftMainPanel();
		RightMainPanel rightPanel = new RightMainPanel();
		
		leftPanel.setBackground(new Color(255,0,0));
		rightPanel.setBackground(new Color(0,255,0));

		add(leftPanel);
		add(rightPanel);
		//pack();
				
		
	     
		
		
		
		
	
	}

	
	public static void main(String[] args) {
	MainFrame mFrame = new MainFrame();
	mFrame.setVisible(true);
	mFrame.setResizable(false);
	

	}

}
