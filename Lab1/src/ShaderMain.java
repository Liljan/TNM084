/*
 * A main program to create, init and display a ShaderPanel.
 *
 * Stefan Gustavson 2006-10-24
 *
 */

import java.awt.*;
import javax.swing.*;

public class ShaderMain {
	
	static final int WIDTH = 512;
	static final int HEIGHT = (int) (WIDTH / 1.77777777778);

	// Entry point for the application
	public static void main(String[] args) {
		
		// Instantiate a JFrame and set it up.
		JFrame frame = new JFrame();
		//frame.setTitle("Shader demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the content pane, we use only a single ShaderPanel here
		ShaderPanel panel = new ShaderPanel(WIDTH, HEIGHT);
		frame.add(panel);
		
		// Create and associate a Shader with the ShaderPanel
		//panel.myShader = new DemoShader();
		//panel.myShader = new AntShader(false);
		//panel.myShader = new CirclesShader();
		//panel.myShader = new GradientShader();
		//panel.myShader = new SmokeShader();
		//panel.myShader = new FireShader();
		//panel.myShader = new SineShader();
		//panel.myShader = new DrugsShader();
		//panel.myShader = new LavaShader();
		panel.myShader = new WorleyShader();

		// Pack and display the window
		frame.pack();
		frame.setVisible(true);
		
		// Marcus' re-hack
		frame.setResizable(false);
		frame.setTitle("Bruce, shame on you!");

		// Create and start the animation thread
		Thread animationThread = new Thread(panel);
		animationThread.start();
	}
}
