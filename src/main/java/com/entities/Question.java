package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="questionTable")
public class Question {
	@Id
	@Column(name="questionId")
	private int question_id;
    private String question;
    @OneToMany(mappedBy="question")
    private List<Answer> answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int question_id) {
		super();
		this.question_id = question_id;

	}
	public Question(int question_id, String question) {
		super();
		this.question_id = question_id;
		this.question = question;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question=" + question + ", answer=" + answer + "]";
	}
	
    
}
