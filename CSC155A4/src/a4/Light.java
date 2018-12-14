package a4;

import graphicslib3D.Matrix3D;
import graphicslib3D.MatrixStack;
import graphicslib3D.Point3D;
import graphicslib3D.Vector3D;

public class Light {
	
	private static Point3D light_Loc = new Point3D(-6.8f, 2.2f, 1.1f);
	
	private Vector3D X = new Vector3D(1, 0, 0);
	private Vector3D Y = new Vector3D(0, 1, 0);
	private Vector3D Z = new Vector3D(0, 0, 1);
	
	Light lightsource;
	
	public Light()
	{
		
	}
	
	public Point3D getLight()
	{
		return light_Loc;
	}
	
	public double getLightX()
	{
		return light_Loc.getX();
	}
	
	public double getLightY()
	{
		return light_Loc.getY();
	}
	
	public double getLightZ()
	{
		return light_Loc.getZ();
	}
	
	public void setLightX(double x)
	{
		Point3D X_mov = new Point3D(X.normalize());
		X_mov = X_mov.mult(x);
		light_Loc = light_Loc.add(X_mov);
	}
	
	public void setLightY(double y)
	{
		Point3D Y_mov = new Point3D(Y.normalize());
		Y_mov = Y_mov.mult(y);
		light_Loc = light_Loc.add(Y_mov);
	}
	
	public void setLightZ(double z)
	{
		Point3D Z_mov = new Point3D(Z.normalize());
		Z_mov = Z_mov.mult(z);
		light_Loc = light_Loc.add(Z_mov);
	}

}
