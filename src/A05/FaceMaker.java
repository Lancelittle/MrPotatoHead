package A05;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author Lance R. Walker
 *
 */
public class FaceMaker extends JFrame{
	
	public FaceMaker(){
		setSize(605, 535);
		
		Face face = new Face();
		add(face);

		FaceController faceController = new FaceController(face);
		add(faceController, BorderLayout.WEST);
	}
}
