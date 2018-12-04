package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class forwardAction extends AbstractAction {

	private static double amount = 0.0;
	Camera Cam;
	
	public forwardAction(Camera oldCamera)
	{
		Cam = oldCamera;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		amount = -1.0;
		Cam.setCamZ(amount);
		
		//System.out.println("SUCESS");
	}
	
	

	

}
