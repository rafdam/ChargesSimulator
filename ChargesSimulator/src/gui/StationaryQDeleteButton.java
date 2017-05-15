package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class StationaryQDeleteButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StationaryQDeleteButton() {
		super("DELETE");
		// button remove row
        addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = StationaryQInPanel.table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                	StationaryQTable.model.removeRow(i);
                	
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
	}

	public StationaryQDeleteButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeleteButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeleteButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public StationaryQDeleteButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
