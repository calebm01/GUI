package gui;

public class QuizCard {
	//set up fields / attributes of a quiz card
	private String Question;
	private String answer;
	
	// build constructor that builds a quiz card
	public QuizCard(String question, String answer) {
		Question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
