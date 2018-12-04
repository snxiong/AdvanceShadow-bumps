package Starter;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class lightBackwardAction extends AbstractAction{

	private static double amount = 0.5;
	Light lightsource;
	
	lightBackwardAction(Light oldLightsoruce)
	{
		lightsource = oldLightsoruce;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lightsource.setLightZ(amount);
	}
	
	
}
