package A05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * @author Lance R. Walker
 *
 */

public class FaceController extends JPanel{
	private final Face face;
	private final JCheckBox eyesCheckBox;
	private final JCheckBox noseCheckBox;
	private final JCheckBox mouthCheckBox;
	private final JCheckBox shoesHatCheckBox;
	private final JCheckBox randomCheckBox;
	private final JButton updatebtn;
	private final JLabel label;
	
	public FaceController(Face myFace){
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(15,1));
		Border innerBorder = BorderFactory.createTitledBorder(null,"Mr. Potato Head",
				TitledBorder.LEFT,TitledBorder.TOP, new Font("broadway",Font.PLAIN,16), Color.BLUE);
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5 ,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		setPreferredSize(new Dimension(200, getHeight()));
		
		face = myFace;
		
		label = new JLabel("Your Choice. . .");
		label.setFont(new Font("broadway", Font.PLAIN, 16));
		label.setForeground(Color.BLUE);

		add(new JLabel());
		add(label);
		add(new JLabel());
		eyesCheckBox = getCheckBox("Eyes");
		add(new JLabel());
		noseCheckBox = getCheckBox("Nose");
		add(new JLabel());
		mouthCheckBox = getCheckBox("Mouth");
		add(new JLabel());
		shoesHatCheckBox = getCheckBox("Hat and Shoes");
		add(new JLabel());
		randomCheckBox = getCheckBox("Random");
		add(new JLabel());
		updatebtn = getUpdateButton();
	}
	
	/**
	 * @return random boolean
	 */
	private boolean randomBoolean(){
	    return Math.random() < 0.5;
	}
	
	/**
	 * @param text name for checkBox
	 * @return created checkBox
	 */
	private JCheckBox getCheckBox(String text) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setForeground(Color.BLUE);
        checkBox.setBackground(Color.LIGHT_GRAY);
        checkBox.setFont(new Font("broadway", Font.PLAIN, 16));
        
        add(checkBox);
        
        return checkBox;
    }
	
	/**
	 * @return update button
	 * buttons action event changes face.
	 */
	private JButton getUpdateButton() {
        JButton button = new JButton("Update");
        button.setForeground(Color.BLUE);
        button.setFont(new Font("broadway", Font.PLAIN, 16));
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	if(eyesCheckBox.isSelected()){
            		face.update(true, false, false);
            	}
            	
            	if(noseCheckBox.isSelected()){
            		face.update(false, true, false);
            	}
            	
            	if(mouthCheckBox.isSelected()){
            		face.update(false, false, true);
            	}
            	
            	if(randomCheckBox.isSelected()){
            		face.update(randomBoolean(), randomBoolean(), randomBoolean());
            	}
            	
            	if(shoesHatCheckBox.isSelected()){
            		face.update(false, false, false);
            	}
            }
        });
        add(button);
        return button;
    }
}

