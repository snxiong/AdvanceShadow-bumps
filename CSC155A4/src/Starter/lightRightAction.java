package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class lightRightAction extends AbstractAction{

	private static double amount = 0.5;
	Light lightsource;
	
	lightRightAction(Light oldLightsource)
	{
		lightsource = oldLightsource;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lightsource.setLightX(amount);
	}

}
