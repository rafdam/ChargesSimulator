package gui;

import java.awt.Color;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;


//author:Czajka
//Panel of moving charges

public class MovingQPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovingQPanel() {	
		setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
		setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.BLACK, 3));		
		
		MovingQLabel label = new MovingQLabel();
		MovingQInPanel inPanel = new MovingQInPanel(); //contain table of charges		
		MovingQAddButton addButton = new MovingQAddButton();
		MovingQEditButton editButton = new MovingQEditButton();
		MovingQDeleteButton deleteButton = new MovingQDeleteButton();
		MovingQDeployButton deployButton = new MovingQDeployButton();
		
		
		add(label, "width 100%, height 5%, span, wrap");
		add(inPanel,"width 100%, height 75%, span");
		add(addButton,"width 33%, height 10%");
		add(editButton,"width 33%, height 10%");
		add(deleteButton,"wrap, width 33%, height 10%");
		add(deployButton,"width 50%, height 10%, span, wrap, align center");	
					
	}
}
