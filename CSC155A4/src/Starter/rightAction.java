package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class rightAction extends AbstractAction{

	private static double amount = 0.0;
	Camera Cam;
	
	public rightAction(Camera oldCamera)
	{
		Cam = oldCamera;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		amount = 1.0;
		Cam.setCamX(amount);
		//System.out.println("SUCESS");
	}
	


}
