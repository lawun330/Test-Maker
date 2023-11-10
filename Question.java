package PA;

import java.awt.*;
import javax.swing.*;

public abstract class Question {
	
	// initialize class variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// declare instance variables
	QuestionDialog question;
	String correctAnswer;
	
	// constructor subroutine
	Question(String question) {
		// create a question box(QBox)
		this.question = new QuestionDialog();
				
		// create one grid layout 
		this.question.setLayout(new GridLayout(0,1));
		
		// add the label to the grid // position the text(question) CENTER within the label
		this.question.add(new JLabel("    " + question + "    ", JLabel.CENTER));
	}
	
	// customize the question box(QBox)
	void initQuestionDialog() {
		question.setModal(true);	// do not dispose right away
		question.pack();			// resize the box
		question.setLocationRelativeTo(null);	// center the box
	}
	
	// instance method to ask the user
	String ask() {
		question.setVisible(true);	// set the question box visible until it is disposed
		return question.answer;		// return the button answer
	}
		
	// instance method for checking the correct answer
	void check() {
		nQuestions++;						// number of questions asked
		String answer = ask();		// call the method
		if (answer.equals(correctAnswer)) {	// check the correct answer
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;						// get a point
		}
		else								// for the incorrect answer
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
	}
	
	// class method to show results
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");
	}
}

