package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class upArrowAction extends AbstractAction{

	private static float amount = 0.0f;
	private boolean active = false;
	protected int mode = 1;
	Camera Cam;
	
	public upArrowAction(Camera oldCamera)
	{
		Cam = oldCamera;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		amount = 2.0f;
		Cam.setMode(mode);
		active = true;
	}
	
	

}
