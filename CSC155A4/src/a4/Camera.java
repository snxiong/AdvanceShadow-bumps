package a4;

import graphicslib3D.Matrix3D;
import graphicslib3D.MatrixStack;
import graphicslib3D.Point3D;
import graphicslib3D.Vector3D;

public class Camera {

	private static Point3D Cam_loc = new Point3D(0.0, 0.2, 20.0);
	
	private Vector3D U = new Vector3D(1, 0, 0);
	private Vector3D V = new Vector3D(0, 1, 0);
	private Vector3D N = new Vector3D(0, 0, 1);
	
	private static int mode = 0;
	
	protected double panAmount = 2.0;
	
	public Camera()
	{
		
	}
	
	public int cameraMode()
	{
		return mode;
	}
	
	
	public void setMode(int currentMode)
	{
		mode = currentMode;
	}
	

	// GET FUNCTIONS FOR THE X, Y, Z COORDINATES
	
	public double getCamX()
	{
		return Cam_loc.getX();
	}
	
	public double getCamY()
	{
		
		return Cam_loc.getY();
	}
	
	public double getCamZ()
	{
		
		return Cam_loc.getZ();
	}
	
	// MOVES THE CAMREA IN THE X DIRECTION
	public void setCamX(double x)
	{
		Point3D U_mov = new Point3D (U.normalize());
		U_mov = U_mov.mult(x);
		Cam_loc = Cam_loc.add(U_mov);
		//System.out.println("move in x");
		
	}
	
	// MOVES THE CAMERA IN THE Y DIRECTION
	public void setCamY(double y)
	{
		Point3D V_mov = new Point3D(V.normalize());
		V_mov = V_mov.mult(y);
		Cam_loc = Cam_loc.add(V_mov);
		//System.out.println("move in y");
	}
	
	// MOVES THE CAMERA IN THE Z DIRECTION
	public void setCamZ(double z)
	{
		Point3D N_mov = new Point3D(N.normalize());
		N_mov = N_mov.mult(z);
		Cam_loc = Cam_loc.add(N_mov);
		//System.out.println("move in z");
	}
	
	// FUNCTION TO RETURN THE DEGREE THE CAMERA IS SUPPOSE TO PAN TO
	public double computeView(double panDegree, int active)
	{
		//System.out.println("move in pan");
		if(mode == 1 && active == 1)
		{
			mode = 0;
			panDegree -= panAmount;
			
		}
		else if(mode == 2 && active == 1)
		{
			mode = 0;
			panDegree += panAmount;
		}
		else if(mode == 3 && active == 2)
		{
			mode = 0;
			panDegree += panAmount;
		}
		else if(mode == 4 && active == 2)
		{
			mode = 0;
			panDegree -= panAmount;
		}
		return panDegree;
	}

}
