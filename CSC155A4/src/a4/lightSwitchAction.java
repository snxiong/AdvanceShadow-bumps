package a4;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class lightSwitchAction extends AbstractAction{

	private static int mode = 1;
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	//	System.out.println("lightswitch activated mode = " + mode);
		if(mode == 0)
		{
			mode = 1;
		}
		else
		{
			mode = 0;
		}
	}
	
	public int lightMode()
	{
		return mode;
	}

}
