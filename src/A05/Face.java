package A05;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Lance R. Walker
 *
 */
public class Face extends JPanel {
	private final ImageIcon[] faceImages = {new ImageIcon(getClass().getResource("face1.png")),
		new ImageIcon(getClass().getResource("face2.png")),
		new ImageIcon(getClass().getResource("face3.png"))};
	
	private final ImageIcon[] eyesImages = {new ImageIcon(getClass().getResource("eyes1.png")),
			new ImageIcon(getClass().getResource("eyes2.png")),
			new ImageIcon(getClass().getResource("eyes3.png"))};
	
	private final ImageIcon[] noseImages = {new ImageIcon(getClass().getResource("nose1.png")),
			new ImageIcon(getClass().getResource("nose2.png")),
			new ImageIcon(getClass().getResource("nose3.png"))};
	
	private final ImageIcon[] mouthImages = {new ImageIcon(getClass().getResource("mouth1.png")),
			new ImageIcon(getClass().getResource("mouth2.png")),
			new ImageIcon(getClass().getResource("mouth3.png"))};
	
	private final ImageIcon  backgroundPicture =  
			new ImageIcon(getClass().getResource("Andy's room.png"));
	
	
	private ImageIcon face; 
	private ImageIcon eyes; 
	private ImageIcon nose; 
	private ImageIcon mouth;
	
	private int faceCounter = 0;
	private int eyesCounter = 0;
	private int noseCounter = 0;
	private int mouthCounter = 0;

	public Face(){
		face = faceImages[0];
		eyes = eyesImages[0];
		nose = noseImages[0];
		mouth = mouthImages[0];
	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
		backgroundPicture.paintIcon(null, graphics, 0, 0);
		face.paintIcon(null, graphics, 0, 30);
		eyes.paintIcon(null, graphics, 130, 140);
		mouth.paintIcon(null, graphics, 130, 280);
		nose.paintIcon(null, graphics, 130, 230);
		}
	
	/**
	 * @param eyesCheckBox, noseCheckBox, mouthCheckBox determines if features will change.
	 * changes features and repaint()
	 */
	public void update(boolean eyesCheckBox, boolean noseCheckBox, boolean mouthCheckBox){
		if(eyesCheckBox){
			if(eyesCounter < eyesImages.length -1){
				++this.eyesCounter;
			}
			
			else
				this.eyesCounter = 0;
			
			eyes = eyesImages[eyesCounter];
			
		}
		
		if(noseCheckBox){
			if(noseCounter < noseImages.length -1){
				++this.noseCounter;
			}
			
			else
				this.noseCounter = 0;
			
			nose = noseImages[noseCounter];
		}
		
		if(mouthCheckBox){
			if(mouthCounter < mouthImages.length -1){
				++this.mouthCounter;
			}
			else
				this.mouthCounter = 0;
			
			mouth = mouthImages[mouthCounter];
		}
		
		if(eyesCheckBox == false && noseCheckBox == false && mouthCheckBox == false){
			if(faceCounter < faceImages.length -1){
				++this.faceCounter;
			}
			else
				this.faceCounter = 0;
			
			face = faceImages[faceCounter];
		}
		
		repaint();
	}
}
