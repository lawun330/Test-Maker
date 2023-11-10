package PA;

import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener{
	
	// instance variable to store answer
	String answer;
	
	// implementation of a method in ActionListener interface
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand(); // label of the button that generated event "e"
		dispose();	// destroy all components
	}
}
