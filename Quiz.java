package PA;

public class Quiz {
	
	public static void main(String[] args) {
		// first multiple-choice question
		Question MCquestion = new MultipleChoiceQuestion(
				"Choose a computer OS",
				"Windows",
				"Tables",
				"Chairs",
				"Doors",
				"Desk",
				"a");
		MCquestion.check();
		
		// second multiple-choice question
		MCquestion = new MultipleChoiceQuestion(
				"Which one is NOT the element according to Chemistry?",
				"Oxygen",
				"Hydrogen",
				"Nitrogen",
				"Myelogen",
				"Calcium",
				"d");
		MCquestion.check();
		
		// third multiple-choice question
		MCquestion = new MultipleChoiceQuestion(
				"Choose a NON season",
				"Autumn",
				"Colder",
				"Winter",
				"Spring",
				"Summer",
				"b");
		MCquestion.check();	
		
		// forth multiple-choice question
		MCquestion = new MultipleChoiceQuestion(
				"Select a gerund",
				"Swim",
				"Clock",
				"Shout",
				"Green",
				"Eating",
				"e");
		MCquestion.check();
		
		// fifth multiple-choice question
		MCquestion = new MultipleChoiceQuestion(
				"Choose a planet in our solar system",
				"Real",
				"Sun",
				"Venus",
				"Europe",
				"Pacific",
				"c");
		MCquestion.check();		
		
		// first TRUE/FALSE question
		Question question = new TrueFalseQuestion("I am a robot.", "n");
		question.check();
		
		// second TRUE/FALSE question
		question = new TrueFalseQuestion("A semicolon is important in Java.", "Y");	
		question.check();
		
		// third TRUE/FALSE question
		question = new TrueFalseQuestion("The moonlight is purple.", "false");
		question.check();
		
		// fourth TRUE/FALSE question
		question = new TrueFalseQuestion("Humans cannot fly.", "TRUE");
		question.check();
		
		// fifth TRUE/FALSE question
		question = new TrueFalseQuestion("Everything is impermanent.", "Yes");
		question.check();
		
		// show the result
		Question.showResults();
	}
}
