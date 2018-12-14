package a4;

import graphicslib3D.GLSLUtils;

import com.jogamp.opengl.GL4;
import com.jogamp.opengl.GLContext;

import graphicslib3D.*;


// ERROR CHECKING CLASS TO CALLED WHEN CHECKING FOR VERTEX, FRAG, AND LINK ERRORS
public class errorChecker {

	private int[] vertCompiled = new int[1];
	private int[] fragCompiled = new int [1];
	private int[] linked = new int[1];
	private GLSLUtils util = new GLSLUtils();
	
	
	public errorChecker()
	{
		
	}
	
	
	// vShaderErrorChecker CHECKS FOR VERTEX SHADER ERRORS
	public void vShaderErrorChecker(int vShader, GL4 gl, int[] vertComp)
	{
		util.checkOpenGLError();
		gl.glGetShaderiv(vShader, gl.GL_COMPILE_STATUS, vertCompiled, 0);
		if(vertCompiled[0] == 1)
		{
			System.out.println("Vertex Compilation sucess");
		}
		else
		{
			System.out.println("Vertex Compilation failed");
		}
	}
	
	// fShaderErrorChecker CHECKS FOR FRAG SHADER ERRORS
	public void fShaderErrorChecker(int fShader, GL4 gl, int[] fragComp)
	{
		util.checkOpenGLError();
		gl.glGetShaderiv(fShader, gl.GL_COMPILE_STATUS, fragCompiled, 0);
		if(fragCompiled[0] == 1)
		{
			System.out.println("Fragment Compilation sucess");
		}
		else
		{
			System.out.println("Fragment Compilation failed");
		}
	}
	
	// linkErrorChecker CHECKS FOR LINK ERRORS
	public void linkErrorChecker(int vfprogram, GL4 gl, int[] linked)
	{
		gl.glLinkProgram(vfprogram);
		util.checkOpenGLError();
		gl.glGetProgramiv(vfprogram, gl.GL_LINK_STATUS, linked, 0);
		if(linked[0] == 1)
		{
			System.out.println("Linking succeeded");
		}
		else
		{
			System.out.println("Linking failed");
			util.printProgramLog(vfprogram);
		}
	}
	
}
