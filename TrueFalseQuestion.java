package PA;

import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	// ignore case sensitivity by capitalizing validAnswers
	static final String[] validAnswers = {"F", "FALSE", "N", "NO",
										  "T", "TRUE", "Y", "YES"};
	
	// constructor subroutine
	TrueFalseQuestion(String question, String answer) {
		super(question); // call the superclass constructor
		
		// create one panel to contain buttons
		JPanel buttons = new JPanel();
		
		// add two buttons to the panel
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		
		// add the panel(one panel) to the grid layout(QBox)
		this.question.add(buttons);
		
		// customize the box(QBox)
		initQuestionDialog(); 
		
		// assign value to one instance variable of the parent class
		// correct answer can be any valid string
		for (int i=0; i<validAnswers.length; i++) {	
			if (answer.toUpperCase().equals(validAnswers[i])) {	// capitalize	
				if (i>=4)	// answers corresponding to true starts at the 4th index
					this.correctAnswer = "TRUE";
				else 
					this.correctAnswer = "FALSE";
			}
		}
		// if the correct answer itself is not valid
		if (this.correctAnswer == null) {
			throw new IllegalArgumentException("Please provide the valid & correct answer for a TRUE/FALSE question!");
		}
	}
	
	// a method to add buttons to the panel
	void addButton(JPanel buttons, String label) {
		// create a button
		JButton button = new JButton(label);
		
		// record the answer
		button.addActionListener(question);
		
		// add the button to the panel
		buttons.add(button);
	}
}

