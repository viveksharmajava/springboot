package question;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Question {
  
	
	private String qText;
	private String question_type;
	@Id 
	private String questionId;
	private String parent_question;
	private String option_index;
	private List<String> options= new LinkedList<String>();
	private List<String> child_questions;
	public Question(String questionId, String qText, String parentQuestId, List<String> childQuestions) {
		super();
		this.questionId = questionId;
		this.qText = qText;
		this.parent_question = parentQuestId;
		//this.option_index = option_index;
		this.child_questions = childQuestions;
	}
	public Question() {
		
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getParent_question() {
		return parent_question;
	}
	public void setParent_question(String parent_question) {
		this.parent_question = parent_question;
	}
	public List<String> getChild_questions() {
		return child_questions;
	}
	public void setChild_questions(List<String> child_questions) {
		this.child_questions = child_questions;
	}
	public String getOption_index() {
		return option_index;
	}
	public void setOption_index(String option_index) {
		this.option_index = option_index;
	}
	
	public String getqText() {
		return qText;
	}
	public void setqText(String qText) {
		this.qText = qText;
	}
	
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String
			> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", qText=" + qText + ", options=" + options + ", parentQuestId="
				+ parent_question + ", childQuestions=" + child_questions + "]";
	}
	@Override
	public Object clone() {
		return this;
	}
	
		
}
