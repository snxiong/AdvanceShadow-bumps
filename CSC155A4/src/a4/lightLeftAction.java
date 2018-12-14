package a4;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class lightLeftAction extends AbstractAction{
	
	private static double amount = -0.5;
	Light lightsource;
	
	lightLeftAction(Light oldLightsource)
	{
		lightsource = oldLightsource;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lightsource.setLightX(amount);
	}
	

}
