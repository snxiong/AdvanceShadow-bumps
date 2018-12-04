package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class spaceAction  extends AbstractAction{

	private int mode = 1;

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("spaceswitch activated");
		if(mode == 0)
		{
			mode = 1;
		}
		else
		{
			mode = 0;
		}
	}
	
	public int axesMode()
	{
		return mode;
	}

}
