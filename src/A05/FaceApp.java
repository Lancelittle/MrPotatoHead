/*******************************************************
* Name:Lance Walker
* T/Th 11:30 - 1:50
* Margarethe Posch
* Assignment: A05
*******************************************************/
package A05;

import javax.swing.JFrame;

/**
 * @author Lance R. Walker
 *
 */
public class FaceApp {

	public static void main(String[] args) {
		FaceMaker myFaceMaker  = new FaceMaker();
		myFaceMaker.setResizable(false);
		myFaceMaker.setVisible(true);
		myFaceMaker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
