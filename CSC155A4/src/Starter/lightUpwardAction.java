package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class lightUpwardAction extends AbstractAction{
	
	private static double amount = 0.5;
	Light lightsource;
	
	public lightUpwardAction(Light oldLightsource)
	{
		lightsource = oldLightsource;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lightsource.setLightY(amount);
	}

}
