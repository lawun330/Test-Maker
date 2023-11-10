package PA;

import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {	
	
	// constructor subroutine
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
		super(query);	// call the superclass constructor
				
		// add five buttons(five panels) to the grid layout(QBox)
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		
		// customize the box(QBox)
		initQuestionDialog(); 
		
		// assign value to one instance variable of the parent class
		correctAnswer = answer.toUpperCase();
	}
	
	// a method to create multiple buttons
	void addChoice(String name, String label) {
		// create a panel to contain button and label
		JPanel choice =  new JPanel(new BorderLayout());	// create a border layout
		
		// create a button
		JButton button = new JButton(name);
		
		// record the answer
		button.addActionListener(question);
		
		// add the button to the panel
		choice.add(button, BorderLayout.WEST);	// position WEST relative to the label
		
		// add the label to the panel // position CENTER relative to the button
		// position the text(choice text) LEFT within the label
		choice.add(new JLabel(" "+label+"   ",JLabel.LEFT),BorderLayout.CENTER);
		
		// add the panel(border layout) to the grid layout(QBox)
		question.add(choice);
	}
}

