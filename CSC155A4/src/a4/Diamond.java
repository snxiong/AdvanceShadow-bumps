package a4;

import graphicslib3D.*;
import static java.lang.Math.*;

public class Diamond {
	
	private int numVertices = 24, numIndices;
	private int [] indices;
	private Vertex3D[] vertices;
	
	float[] diamond_positions =
		{	
				
			// upside pyramid 4 triangles
			-1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 4.0f,
			-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 4.0f, 
			1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 4.0f, 
			1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 4.0f, 
			
			
			// upside down pyramid 4 triangles
			-1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -4.0f,
			-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, -4.0f, 
			1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -4.0f, 
			1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -4.0f, 
		};
	
	public float[] getDiamondPos()
	{
		return diamond_positions;
	}
	
	public Diamond()
	{
	
		InitDiamond();
		
	}
	
	private void InitDiamond()
	{
		
	}
	
	public int getVertices()
	{
		return numVertices;
	}
}
