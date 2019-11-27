package question;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Question {
  
	
	private String qText;
	private String questionType;
	@Id 
	private String questionId;
	private String parentQuestId;
	private List<String> options= new LinkedList<String>();
	private List<String> childs;
	public Question(String questionId, String qText, String parentQuestId, List<String> childQuestions) {
		super();
		this.questionId = questionId;
		this.qText = qText;
		this.parentQuestId = parentQuestId;
		this.childs = childQuestions;
	}
	public Question() {
		
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public List<String> getChilds() {
		return childs;
	}
	public void setChilds(List<String> childs) {
		this.childs = childs;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getqText() {
		return qText;
	}
	public void setqText(String qText) {
		this.qText = qText;
	}
	public String getParentQuestId() {
		return parentQuestId;
	}
	public void setParentQuestId(String parentQuestId) {
		this.parentQuestId = parentQuestId;
	}
	public List<String> getChildQuestions() {
		return childs;
	}
	public void setChildQuestions(List<String> childQuestions) {
		this.childs = childQuestions;
	}
	public void addChildQuestion(String child) {
		this.childs.add(child);
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
				+ parentQuestId + ", childQuestions=" + childs + "]";
	}
	@Override
	public Object clone() {
		return this;
	}
	
		
}
