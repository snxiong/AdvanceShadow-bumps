package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class downwardAction extends AbstractAction{

	private static double amount = 0.0;
	Camera Cam;
	
	public downwardAction(Camera oldCamera)
	{
		Cam = oldCamera;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		amount = -1.0;
		Cam.setCamY(amount);
		//System.out.println("SUCESS");
	}


}
