package a4;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class lightForwardAction extends AbstractAction{
	
	private static double amount = -0.5;
	Light lightsource;
	
	lightForwardAction(Light oldLightsource)
	{
		lightsource = oldLightsource;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		lightsource.setLightZ(amount);
	}

}
