package gui;
import java.awt.Dimension;
//author: Mikolaj Czajka
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

//import com.sun.javafx.tk.Toolkit;
//import com.sun.prism.paint.Color;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() throws HeadlessException {
		setTitle("Charges Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setPreferredSize(new Dimension(1200,800));
		setSize(1200,800);
		setLayout(null);
		
		StationaryQPanel stationaryQpanel = new StationaryQPanel(); // Panel for table and buttons with stationary charges
		add(stationaryQpanel);
		
		MotionQPanel motionQpanel = new MotionQPanel(); // Panel for table and buttons with moving charges
		add(motionQpanel);
		
		MainFrameTitleLabel titlelabel = new MainFrameTitleLabel();
		add(titlelabel);
		
		
	     
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	public MainFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	MainFrame mFrame = new MainFrame();
	mFrame.setVisible(true);
	

	}

}
