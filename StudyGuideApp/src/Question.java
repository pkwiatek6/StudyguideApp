
public abstract class Question {
	

	public Question() {
		this.setQuestionNumber(0);
		this.setQuestion("Question");
		this.setQuestionAnswer("Answer");
	}
	public Question(int n,String Question,String Answer) {
		this.setQuestionNumber(n);
		this.setQuestion(Question);
		this.setQuestionAnswer(Answer);
	}
	
	
	
	
	private int number;
	
	private String question, answer;
	
	protected int getQuestionNumber(){
		return number;
	}
	protected String getQuestion(){
		return question;
	}
	protected String getAnswer(){
		return answer;
	}
	public void setQuestionNumber(int questionNumber) {
		number = questionNumber;
	}
	public void setQuestion(String q) {
		question = q;
	}
	public void setQuestionAnswer(String a) {
		answer = a;
	}
}
