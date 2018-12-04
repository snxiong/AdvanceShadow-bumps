package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class backwardAction extends AbstractAction{

	private static double amount = 0.0;
	Camera Cam;
	
	public backwardAction(Camera oldCamera)
	{
		Cam = oldCamera;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		amount = 1.0;
		Cam.setCamZ(amount);	
	}
	


}
